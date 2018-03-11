class StacktInt {
  var elems: List[Int] = Nil
  def push(x: Int) { elems = x :: elems }
  def top: Int = elems.head
  def pop() { elems = elems.tail }
  override def toString(): String = { elems.mkString(",") }
}

class StackString {
  var elems: List[String] = Nil
  def push(x: String) { elems = x :: elems }
  def top: String = elems.head
  def pop() { elems = elems.tail }
  override def toString(): String = { elems.mkString(",") }
}

class Stack[T] {
  var elems: List[T] = Nil
  def push(x: T) { elems = x :: elems }
  def top: T = elems.head
  def pop() { elems = elems.tail }
  override def toString(): String = { elems.mkString(",") }
}

val stack1 = new StacktInt()
stack1.push(1)
stack1.push(2)
stack1.push(3)
stack1
stack1.pop()
stack1

print(stack1)

val stack2 = new StackString()
stack2.push("a")
stack2.push("b")
stack2.push("c")
stack2
stack2.pop()
stack2

val stack3 = new Stack[String]()
stack3.push("a")
stack3.push("b")
stack3.push("c")
stack3
stack3.pop()
stack3


def stackMaker[T](): Stack[T] = {
  new Stack[T]
}

stackMaker[Double]()
stackMaker[Long]()

