package ScalaProgramming.ch2

object HelloWorld {
  def main(args: Array[String]):Unit = {
    println("Hello, World!")
  }
}

object AppHelloWorld extends App {

  // 此物件繼承 trait App，物件內的程式碼都會被執行
  println("Hello, World!")

}
