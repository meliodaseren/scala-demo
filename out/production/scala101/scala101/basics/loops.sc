for (x <- 1 to 4) {
  println(x * x)
}

for (x <- 1 until 5) {
  println(x * x)
}

1 to 4
1.to(4)
1 until 5
1.until(5)


for (x <- 1 until 5) yield {
  x * x
}

val v = for (x <- 1 until 5) yield {
  x * x
}

var j = 10

while (j >= 0) {
  println(j)
  j -= 1
}

var j2 = 0
do { println(j2); j2 += 1 } while (j2 <= 10)
