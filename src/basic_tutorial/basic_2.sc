/* Method definition */
def add(x:Int, y:Int):Int = {
  return x + y
}
println(add(42,13))


def add_re(x:Int, y:Int) = {  // result type is inferred
  x + y                       // "return" keyword is optional
}
println(add_re(42,13))


// Curly braces are optional on single line blocks
def add_re2(x:Int, y:Int) = x + y
println(add_re2(42,13))


/* Anonymous Functions */
/* http://scalatutorials.com/tour/interactive_tour_of_scala_anonymous_functions.html */

// a method that requires a function as a parameter
// the function's type is (Int,Int) => Int
// e.g. maps from 2 Ints to an Int
def doWithOneAndTwo(f: (Int, Int) => Int) = {
  f(1, 2)
}

// Explicit type declaration
val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y)

// The compiler expects 2 ints so x and y types are inferred
val call2 = doWithOneAndTwo((x, y) => x + y)

// Even more concise syntax
val call3 = doWithOneAndTwo(_ + _)

println(call1, call2, call3)


def add1(x:Int, y:Int) = x + y     // method
def add2 = (x:Int, y:Int) => x + y // anonymous function
def add3:(Int,Int)=>Int = _ + _    // alternate way
def add4 = (_ + _):(Int,Int)=>Int  // alternate way, rare

println(add1(42,13))
println(add2(42,13))
println(add3(42,13))
println(add4(42,13))


/* Return multiple variables */
/* https://www.tutorialspoint.com/scala/scala_tuples.htm */

def swap(x:String, y:String) = (y, x)
val (a,b) = swap("hello","world")
println(a, b)


/* Declare multiple variables */
//var x, y, z = 0
//var c, python, java = false
//println(x, y, z, c, python, java)


/* Assign multiple variables */
var (d, e, f, g, spark, hadoop) = (1, 2, 3, true, false, "no!")
println(d, e, f, g, spark, hadoop)
