val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

weekDays.head
weekDays.tail

weekDays.size
weekDays.reverse

weekDays(1)

weekDays.contains("Mon")
weekDays contains "Mon"

for (c <- weekDays)
  println(c)

weekDays.size

var rest = weekDays
while (!rest.isEmpty) {
  println(s"Today is ${rest.head}, ${rest.size} days left")
  rest = rest.tail
}

var rest2 = weekDays
while (rest2 != Nil) {
  println(s"Today is ${rest2.head}, ${rest2.size} days left for the weekend")
  rest2 = rest2.tail
}

val weekEnds = List("Sat", "Sun")
val weeklyHolidays = List("Sat", "Sun")
weekEnds == weeklyHolidays

("Mon" :: weekDays).distinct