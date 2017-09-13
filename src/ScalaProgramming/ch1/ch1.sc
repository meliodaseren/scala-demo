/* Function */

def celsiusToFahrenheit(c: Double): Double = {
  println("C to F")
  c * 9 / 5 + 32   // return
}

celsiusToFahrenheit(38)


// Scala 會自動推斷回傳值的型別
def celsiusToFahrenheit2(c: Double) = {
  println("C to F")
  c * 9 / 5 + 32   // return
}

celsiusToFahrenheit2(38)


def min(x: Int, y: Int) = if(x > y) y else x


// Unit 相當於 Java 中的 void
def sayHi(): Unit = println("Hi")


/* Functional Programming */

val list = List(3, 2, 1, 5, 6, 4)

/* 1 */
var i = 0
var min = Int.MaxValue
while(i < list.length) {
  if(min > list(i))
    min = list(i)

  i += 1
}
println("The minimal number in the list is " + min)

/* 2 */
// 函數式編程風格來重新撰寫一次 1 的程式碼
def minF(x: Int, y: Int) = if(x > y) y else x
val min2 = list.reduceLeft(minF)
println("The minimal number in the list is " + min2)

/* 3 */
// 更進一步精簡程式碼
val min3 = list.reduceLeft((x, y) => if(x > y) y else x)
println("The minimal number in the list is " + min3)
