val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

val weekDays2 = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: Nil
val weekend = List("Sat", "Sun")

val allDays = weekDays ::: weekend

val allDays2 = weekDays ++ weekend

val weekDaysPlusWeekend = List(weekDays, weekend)
val allDays3 = weekDaysPlusWeekend.flatten

val dayIndices = List(1, 2, 3, 4, 5, 6, 7)

dayIndices zip allDays