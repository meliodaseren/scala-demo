/* Loops using while */
println("Step 1: How to use while loop in Scala")
var numberOfDonutsToBake = 10
while (numberOfDonutsToBake > 0) {
  println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
  numberOfDonutsToBake -= 1
}

var i = 0
var sum = 0
while (i < 10) {
  sum += i
  i += 1
}
println(sum)


/* Loops using for */
var sum2 = 0
for(i <- 0 until 10) {
  sum2 += i
}
println(sum2)


/* Loops without loops */
//Or, neither while nor for
(0 until 10).sum


/* if */
if (true)
  println("no braces on a single expression")

if (1 + 1 == 2) {
  println("multiple")
  println("statements")
  println("require")
  println("braces")
} else {
  println("new math is found!")
  println("or your CPU went crazy")
}

val likeEggs = false
val breakfast =
  if (likeEggs) "scrambled eggs"
  else "Apple"

println(breakfast)

// The ternary operator
// (condition ? truePart : falsePart)
// in Scala is simply
// if (condition) truePart else falsePart


/* Match as a Switch */
/* http://docs.scala-lang.org/tour/pattern-matching.html */

val selection = "One"
selection match {
  case "One" => println("You selected option one!")
  case "Two" => println("You selected option two!")
  case _ => println("You selected something else: ")
}
