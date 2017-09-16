class Car (val ABS:Boolean = true,
           val TCS:Boolean = false,
           val Sunroof:Boolean = false) {

  var description = "A car with "

  def finalDescription(): Unit = {
    var opt = false

    if(ABS) {description += "ABS "
      opt = true}
    if(TCS) {description += "TCS "
      opt = true}
    if(Sunroof) {description += "Sunroof"
      opt = true}
    if(!opt) description += "nothing"
  }

  finalDescription()
  println(description)

  def this (ABS:Boolean, TCS:Boolean) {
    this (ABS, TCS, false)
  }
}

object mainTest2 {
  def main(args: Array[String]): Unit = {
    val car = new Car(false, true, true)
    val car2 = new Car(false, false, false)
    val car3 = new Car (true, true)
  }
}
