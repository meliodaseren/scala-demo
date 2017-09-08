val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

weekDays.foreach(println(_))

weekDays.map(_ == "Mon")

weekDays.map(_.toLowerCase)

val IsMonday = (x: String) => { x == "Mon" }: Boolean

weekDays.filter(IsMonday)

weekDays.sortBy(_(0))

weekDays.sorted

weekDays.sortWith(_ < _)

weekDays.sortWith(_ > _)