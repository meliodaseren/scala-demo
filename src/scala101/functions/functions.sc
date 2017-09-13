(x: Int) => x + 1: Int

(x: Int) => x + 1

//(x) => x + 1 // This does not compile.

(x: Int, y: Int) => x + y

() => 42

val addOne = (x: Int) => x + 1
addOne(1)

val add = (x: Int, y: Int) => x + y
add(1, 2)

val getTheAnswer = () => 42
getTheAnswer()

def add2(x: Int, y: Int): Int = x + y
add(1, 2)

def add3(x: Int, y: Int): Int = x + y
// val add4 = add2 // This does not compile.
// val add5 = add3 // This does not compile either.

add2 _

val add4 = add2 _
add4(1, 2)

val add5: (Int, Int) => Int = add2
add5(1, 2)

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
addThenMultiply(1, 2)(3)