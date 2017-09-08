val aNumber: Int = 1
val bigNumber: Long = 12345678901234l
val smallNumber: Byte = 127
val truth: Boolean = true
val charA: Char = 'a'
val pi1: Float = 3.141f
val pi2: Double = 3.14159265d

val o = new java.lang.Object()
val s1 = "10"
val s2 = new String("10.0")

s1.isInstanceOf[java.lang.Object]
s1.isInstanceOf[AnyRef]
truth.isInstanceOf[Boolean]

pi1.toString
pi1.toInt

aNumber.toLong
//bigNumber.toInt
bigNumber.toString

s1.toDouble