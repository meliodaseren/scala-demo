/* Scala For Impatient */

/* This Worksheet need to use REPL Mode */

/* 1.1 */

8 * 5 + 2

// 可以直接使用 res0
0.5 * res0
"Hello," + res0
// res0是val，不可變動

// val為常量，不可變動
val answer = 8 * 5 + 2
0.5 * answer
// Error reassignment to val: answer = 0

// 同時宣告多個變量
val xmax, ymax = 100
var greeting, message: String = null

/* -------------------------------------------------- */
/* 1.3 */

// 兩個字串的共通字元
"Hello".intersect("World")

1.toString()

// + - * / %
// & | ^ >> <<
val a, b = 10
a + b
a.+(b)
// 實際上是使用 +() 函數

1.to(10)
1 to 10
// Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

var counter = 0
counter += 1
// Scala沒有++及--

val x: BigInt = 1234567890
x * x * x
// Java 要寫成 x.multiply(x).multiply(x)

/* -------------------------------------------------- */
/* 1.5 */

import math._
// 可以省去 scala 前綴 import scala.math._
// _ 類似於Java的 *

sqrt(2)
pow(2, 4)
min(3, Pi)
pow(sqrt(3), 2)

BigInt.probablePrime(100, scala.util.Random)

// 獲取字串中不重複的字元
"Hello".distinct

// 呼叫第i個字元
"Hello"(4)
"Hello".apply(4)

// 將字串或數字轉換為BigInt
BigInt("1234567890")
BigInt.apply("1234567890")

BigInt("1234567890") + BigInt("112358111321")
BigInt("1234567890") * BigInt("112358111321")
