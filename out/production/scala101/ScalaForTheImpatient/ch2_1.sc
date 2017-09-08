/* 2.1 */

val x = 0
if (x > 0) 1 else -1


var s = 0
if (x > 0) s = 1 else s = -1
// 等同於
// val s = if (x > 0) 1 else -1

// 混合類型表達示
if (x > 0) "positive" else -1


// 如果else缺失，會引入一個Unit類，寫作()
if (x > 0) 1
// 等同於
if (x > 0) 1 else ()


if (x > 0) 1
  else if (x == 0) 0 else -1


// 單行寫下多個語句要用 ; 分隔
var n, r = 0
if (n > 0) { r = r * n; n -= 1 }


// {}包含一系列表達示，其結果也是表達示
import math._

var x0, y, y0 = 5
val distance = {
  val dx = x - x0
  val dy = y - y0
  sqrt(dx * dx + dy * dy)}


// 賦值語句都是Unit類，別將它們串接一起
// x = y = 1

/* -------------------------------------------------- */
/* 2.4 */

print("Answer: ")
println(distance)

printf("Hello, %s! You are %d years old.\n", "John", 25)


/* readLine 從控制台讀取輸入 */
/*
val name = readLine("Your name: ")
print("Your age: ")
val age = readInt()
printf("Hello, %s! Next year, your will be %d.\n", name, age + 1)
*/


var n2 = 5
while (n2 > 0) {
  r = r * n2
  n2 -= 1
  println(r)
  print(n2)
}

for (i <- 1 to 5) {
  print(i + " ")
}

val str = "Hello"
var sum = 0
for (i <- 0 until str.length)
  sum += str(i)
  print(sum)

for (ch <- "Hello") sum += ch
println(sum)

// Scala沒有提供break或continue來退出Loop
import scala.util.control.Breaks._
breakable {
  for (i <- 1 to 100) {
    if (i > 5) break else print(i)
  }
}

for (i <- 1 to 3; j <- 1 to 3) print ((10 * i + j) + " ")
// 11 12 13 21 22 23 31 32 33

for (i <- 1 to 3; j <- 1 to 3 if i != j) print ((10 * i + j) + " ")
// 12 13 21 23 31 32

for (i <- 1 to 3; from = 4 - i; j <- from to 3)
  print ((10 * i + j) + " ")
// 13 22 23 31 32 33

// for loop從 yield 開始，並構造出一個集合，每次迭代生成集合中的一個值
for (i <- 1 to 10) yield i % 3
// Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)


for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
// HIeflmlmop

for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
// Vector(H, e, l, l, o, I, f, m, m, p)

for { i <- 1 to 3
  from = 4 - i
  j <- from to 3 }

