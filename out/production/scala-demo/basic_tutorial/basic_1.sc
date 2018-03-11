/* http://scalatutorials.com/ */

import scala.math._

/* Scalculator */
1 + 2

/* Operators are methods */
(1).+(2) // > 3

/* Variables */
var x = 1 + 2 // > x = 3
println(x)
x = 3 * 4     // > x = 12
println(x)

/* Final Variables */
val y = 1 + 2 // val instead of var
println(y)
// x = 3 * 4
// error: reassignment to val


/* Printing values */
/* http://docs.scala-lang.org/zh-cn/overviews/core/string-interpolation.html */
val name = "World"
println(s"Hello, $name")

println(s"Two times three: ${2 * 3}")

/* String interpolation */
val Tau = pow(Pi, 2)
val Tau2 = Math.pow(Pi, 2)
println(s"square of Pi is $Tau")


/* String formatting */
/* https://alvinalexander.com/programming/printf-format-cheat-sheet */
printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))
printf("Now you have %.24f problems.", Math.nextAfter(2.0, 5))


/* Useful operations */

// Number operations: Ranges
// creates a range between 1 to 10 inclusive
val range = 1 to 10
println(range.toList)
// creates a range between 1 to 10 exclusive
val range2 = 1 until 10
println(range2.toList)
// from 2 to 10 with jumps of 3
val range3 = 2 until 10 by 3
println(range3.toList)   // List(2, 5, 8)

// Number convinience methods
val num = -5
val numAbs = num.abs //absolute value
val max5or7 = numAbs.max(7)
val min5or7 = numAbs.min(7)
println(numAbs)  // 5
println(max5or7) // 7
println(min5or7) // 5

// String operations
val reverse = "Scala".reverse // reverse a string
println(reverse)

val cap = "scala".capitalize  // make first char caps
println(cap)

val multi = "Scala!" * 7      // repeat n times
println(multi)

val int = "123".toInt         // parse as Int
println(int)

// Useful methods on collections
// filter - keep only items larger than 4
val moreThan4 = range.filter(_ > 4)
println(moreThan4) // Vector(5, 6, 7, 8, 9, 10)

// map - transform each item in the collection
val doubleIt = range2.map(_ * 2)
println(doubleIt) // Vector(2, 4, 6, 8, 10, 12, 14, 16, 18)
