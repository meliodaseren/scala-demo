class Dog {
  def bark(): Unit = println("woof-woof")
}

class Dog2(n: String) {
  val name = n

  def bark(): Unit = println(s"$name: woof-woof")
}

class Dog3(n: String) {
  def bark(): Unit = println(s"$n: woof-woof")
}

new Dog()

new Dog().bark()

new Dog2("Life").bark()

new Dog3("Life").bark()
