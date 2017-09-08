/* Mutable Collections */
import scala.collection.mutable

val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
val listBuffer = mutable.ListBuffer("a", "b", "c")
val hashSet = mutable.Set(0.1, 0.2, 0.3)
val hashMap = mutable.Map("one" -> 1, "two" -> 2)


/* Mutable Collections Operations */
val hashMap2 = mutable.Map("one" -> 1, "two" -> 2, "three" -> 3)

arrayBuffer += 4
listBuffer += "d"
arrayBuffer -= 1
listBuffer -= "a"
hashMap += "four" -> 4
hashMap -= "one"

arrayBuffer ++= List(5, 6, 7)
hashMap2 ++= Map("five" -> 5, "six" -> 6)
hashMap2 --= Set("one", "three")

println(arrayBuffer)
println(listBuffer)
println(hashMap)


/* Immutable collections with var */
var immutableSet = Set(1, 2, 3)

immutableSet += 4
// this is the same as:
immutableSet = immutableSet + 4

// compare to
val mutableSet = mutable.Set(1, 2, 3)

mutableSet += 4
// this is the same as:
mutableSet.+=(4)

println(immutableSet, mutableSet)
