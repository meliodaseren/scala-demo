/* Scala 會自動引用下面三個套件 */
import java.lang._
import scala._
import Predef._

import scala.collection.mutable

val mutableSet = mutable.Set(1, 2, 3)

val numberArray = new Array[Int](10)

val strArray = new Array[String](10)

strArray(0) = "First Element"
strArray

import scala.collection.mutable.ArrayBuffer
val strArrayVar = ArrayBuffer[String]()
