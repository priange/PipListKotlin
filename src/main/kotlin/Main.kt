import javax.management.MBeanRegistration

fun main(args: Array<String>) {
//give(mutableListOf("Omara","Emmanuel","Etuk","Anabo","Ann","Jane","Angella","Irene","Micheal","Yuventine"))
println(fruitsList(mutableListOf("Mango", "Orange", "lemon", "melon", "passion", "banana", "apple", "berries","bushberries","jackfruit")))

  var names =mutableListOf(20.7,23.9,12.6,3.0)
  val coun = measure(names)
  println(coun)

  val people = listOf(
  Person("Omara",18,10.0,12.0),
  Person("Anabo",44,20.9,60.0),
  Person("Awaso",20,70.8,56.0))
  val sorte = sortedAges(people)
  println(sorte)

}

//Assignment 9: Lists
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun fruitsList(fruits:List<String>):List<String> {
  var emptylist = mutableListOf<String>()
  for (fruit in fruits) {
    if (fruits.indexOf(fruit) % 2 == 0) {
      emptylist.add(fruit)
    }
  }
  return emptylist

}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun measure(names:List<Double>):Pair<Double,Double>{
//  for(x in names) {
//     var count = names.size
    var xx = names.average()
    var q = names.sum()
  return Pair(q,xx)

}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

  fun sortedAges(people:List<Person>):List<Person>{
  return people.sortedByDescending{ it.age}

}
