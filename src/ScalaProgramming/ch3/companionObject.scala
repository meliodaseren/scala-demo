class X (n: Int) {
  X.sum += n
  X.number += 1
}

object X {
  private var sum: Double = 0
  private var number: Int = 0
  def average = sum / number
}

object companionObject {
  def main(args: Array[String]): Unit = {
    val x1 = new X(1)
    val x2 = new X(2)
    val x3 = new X(3)

    println("The average of all: " + X.average)
  }
}
