for(i <- 1.to(5)) println("i = " + i)

for(i <- 1 to 5) println("i = " + i)

for(i <- 1 until 6) println("i = " + i)

for(i <- 1 until(6, 2)) println("i = " + i)

for(i <- 1 to 40 if(i % 4 == 0); if(i % 5 == 0)) println("i = " + i)

for(i <- 1 to 40 if(i % 4 == 0); if(i % 5 == 0)) {
  println("i = " + i)
}

for(i <- 1 to 5 if i > 3) {
  for(j <- 5 to 7 if j == 6) {
    println("i = " + i + ", j = " + j)
  }
}

/* yield 會將 Loop 產生的值傳回集合(Vector) */
var x1 = for(i <- 1 to 5) yield i

var x2 = for(i <- 1 to 5) yield i % 2 == 0

var x3 = for(i <- 1 to 5) yield i / 2
