def causeArithmeticException() = 1 / 0

def causeNullPointerException() = { val s: String = null; s.toLowerCase }

try {
  causeArithmeticException()
  //causeNullPointerException()
  //throw new RuntimeException()

} catch {
  case e: ArithmeticException  => println(s"ArithmeticException caught: $e")
  case e: NullPointerException => println(s"NullPointerException caught: $e")
  case e: Exception            => println(s"Other exceptions caught: $e")

}