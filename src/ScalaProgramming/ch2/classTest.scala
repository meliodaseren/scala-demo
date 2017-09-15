package ScalaProgramming.ch2
import scala.math._

class Point2D {
  var x = 0.0
  var y = 0.0
  val dim = 2
  def distance(p: Point2D) = sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y))
}

class X {
  def f (x: Int) = x + 2
}

class Person {
  var name:String = ""
  private var _age:Int = 0

  def age = _age
  def age_= (value: Int): Unit =
    if (value > _age) _age = value
}

object classTest {
  def main (args: Array[String] ): Unit = {
    val p1 = new Point2D
    val p2 = new Point2D

    p2.x = 1.0
    p2.y = 1.0

    println("p1's dimention : " + p1.dim)
    println("The distance between p1 and p2 : " + (p1 distance p2))
  }
}
