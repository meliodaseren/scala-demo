
trait Similarity {
  def isSimilar(x: Any): Boolean
}

class MyPoint(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  def isSimilar(obj: Any) = obj.isInstanceOf[MyPoint]
}

abstract class BasePoint(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  def isSimilar(obj: Any) = obj.isInstanceOf[BasePoint]

  override def toString: String
}

class MyPoint2(xc: Int, yc: Int, n: String) extends BasePoint(xc, yc) {

  var name = n
  override def toString = s"$name: ($x, $y)"

  def this(n: String) = this(0, 0, n)
}

val p1 = new MyPoint(2, 3)
val p2 = new MyPoint2(2, 4, "p2")
val p3 = new MyPoint2("p3")

p1.isSimilar(p2)
p2.isSimilar(p3)
