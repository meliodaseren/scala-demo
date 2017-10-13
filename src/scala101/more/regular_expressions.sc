val phonePattern = """\((\d\d)\) (\d\d\d)-(\d\d\d\d)""".r
val phoneBook = """John	(03) 667-3758
    Mary	(02) 123-6948
    Alice	(07) 456-3724"""

val firstMatch = phonePattern.findFirstMatchIn(phoneBook)
firstMatch.getOrElse("no matched")

val allMatches = phonePattern.findAllMatchIn(phoneBook)

val m = allMatches.next

m.group(1)
m.group(2)
m.group(3)

for (m <- phonePattern.findAllMatchIn(phoneBook))
  println(s"areaCode=${m.group(1)}, part1=${m.group(2)}, part2=${m.group(3)}")

val aPhone = "(05) 123-4567"
val phonePattern(areaCode, part1, part2) = aPhone

println(s"areaCode=$areaCode, part1=$part1, part2=$part2")

// val (a,b) = ("Hello", 0.1)
// val Array(c,d) = Array(1,2)