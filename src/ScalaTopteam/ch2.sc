/* Use REPL Mode */

var s2:String = _

var s3:String = ""

val v1 = "test"

/* Lazy 變數在使用時才會設定值 */
lazy val v2 = "test"
v2

/* Scala 物件比較不同於 Java 比較記憶體位址，Scala 比較內容 */
v1 == v2
v1.eq(v2)

var str = "Hello"
str.indexOf("o")

str.toUpperCase
str toUpperCase

str.drop(3)
str drop 3

str.slice(1,4)

/* 元組 */
var tuple = ("Hello", "Taiwan", 1)
tuple._1

val s = 'start
