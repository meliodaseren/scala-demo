val words = List("this", "is", "a", "book")
val myPrint = (x: String) => println(x)

words.foreach(myPrint)
words.foreach((x: String) => println(x))
words.foreach(x => println(x))
words.foreach(println(_))

words.foreach(println)