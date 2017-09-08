
val x = 2

x match {
  case 1 => "one"
  case 2 => "two"
}

val x2 = 3

x2 match {
  case 1 => "one"
  case 2 => "two"
  case _ => "No match"
}

x2 match {
  case 1 => "one"
  case 2 => "two"
  case y => s"Nothing matches $y"
}

val result = x2 match {
  case 1 => "one"
  case 2 => "two"
  case _ => "No match"
}

val x3: Any = "1.0"

x3 match {
  case y: Int => s"$y is an Int"
  case y: Float => s"$y is a Float"
  case y: String => s"$y is a String"
  case y => s"No types match $y"
}