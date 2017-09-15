package ScalaProgramming.ch2
import scala.math._

class Point2D {
  var x = 0.0
  var y = 0.0

  val dim = 2
  def distance(p:Point2D) = sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y))
}

