class Point1(x1: Int, y1: Int) {
  var x = x1
  var y = y1

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString = s"($x, $y)"
}

class Point2(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString = s"($x, $y)"

}

class Point3(x1: Int, y1: Int) {
  var x = x1
  var y = y1

  def this() = this(0, 0)

  def this(y: Int) = {
    this(); this.y = y
  }

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString = s"($x, $y)"
}

val pt = new Point1(1, 2)
pt.move(10, 10)
pt

val pt2 = new Point2(1, 2)
pt2.move(10, 10)
pt2

val pt3 = new Point3()
pt3.move(10, 10)
pt3

val pt4 = new Point3(10)
pt4.move(10, 10)
pt4