
class EnumWeekDay1 {
  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

object EnumWeekDay2 {
  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

object EnumWeekDay3 {
  type EnumWeekDay3 = Int

  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

import EnumWeekDay3._

object enumeration {
  def main(args: Array[String]): Unit = {
    val weekday1 = new EnumWeekDay1
    var day = weekday1.Tue

    day = EnumWeekDay2.Wed

    val d1:EnumWeekDay3 = EnumWeekDay3.Mon
  }
}
