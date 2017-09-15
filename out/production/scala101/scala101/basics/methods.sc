def add(x: Int, y: Int): Int = x + y

add(1, 2)

def add2(x: Int, y: Int) = x + y

add2(1, 2)

def addTen(x: Int) = {
  val y = 10
  x + y
}

addTen(10)

// val add3 = addTen // This does not compile.

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
addThenMultiply(1, 2)(3)