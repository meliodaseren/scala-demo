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
