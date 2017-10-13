import scala.io.Source

val book = Source.fromFile("D:/IdeaProjects/scala-demo/resources/war_and_peace.txt")
book.take(100).foreach(print)

val lines = book.getLines()
lines.take(100).foreach(println)

val page = Source.fromURL("https://reference.wolfram.com/language/WebServices/tutorial/GoogleExample.html")
page.getLines.foreach(println)