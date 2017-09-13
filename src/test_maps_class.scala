import scala.collection.mutable

class test_maps_class {
  def main(args: Array[String]) {
    val mmap = mutable.HashMap("a" -> 1, "b" -> 2, "c" -> 3)
    mmap("d") = 4
    println(mmap)
  }
}
