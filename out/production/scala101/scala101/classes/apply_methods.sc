object Incrementor {
  var counter = 0

  def increment(): Int = {
    counter += 1
    counter
  }
  def apply(): Int = {
    increment()
  }
}

class Dog(n: String) {
  val name = n

  def bark(): Unit = println(s"$name: woof-woof")

  def apply() = bark()
}


Incrementor.apply()
Incrementor()
Incrementor()

val aDog = new Dog("Life")
aDog.apply()
aDog()