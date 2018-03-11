val cityCodes = Map(
  "Taipei" -> "TP",
  "Shanghai" -> "SH",
  "Beijing" -> "BJ")

cityCodes("Taipei")

cityCodes.contains("Shanghai")

cityCodes contains "Tokyo"

// cityCodes("Tokyo")

cityCodes.get("Tokyo")

cityCodes.get("Tokyo").getOrElse("Not defined")

val tokyoCode = cityCodes.get("Tokyo") match {
  case None       => "Not defined"
  case Some(code) => code
}

cityCodes.foreach((p: (String, String)) => println(p._1 + "=" + p._2))