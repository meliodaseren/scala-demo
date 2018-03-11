import scala.collection.mutable

object test_maps {
  def main(args: Array[String]) {
    val mmap = mutable.HashMap("a" -> 1, "b" -> 2, "c" -> 3)
    mmap("d") = 4
    println(mmap)
  }
}
