// make a tuple
val person = ("Mary", "Chen", 26, "F", false, ("Taipei", "Hsinchu"))

// 2-element tuple can be declared with -> or the normal way

val personAge = ("John Smith", 30)
val personAge2 = "John Smith" -> 30

// use _1 to access first element. Tuples are 1-indexed.
person._1 + " " + person._2

// person.productArity is the number of this tuple
person.productArity

// person.productIterator is the iterator of this tuple
person.productIterator

person.productIterator.foreach(i => println("Value = " + i))

val (firstName, lastName, age, gender, married, (address1, address2)) = person

val printPersonAge = (name: String, age: Int) => println(s"Name:$name Age:$age")

printPersonAge(s"$firstName $lastName", age)

printPersonAge.tupled(personAge)