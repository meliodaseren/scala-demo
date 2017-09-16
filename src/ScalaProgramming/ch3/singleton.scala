package ScalaProgramming.ch3

object Ticketer {
  private var n = 0
  def getTicket = {n += 1; n}
}

/* Singleton 物件，類別只有單一的實例 */

object singleton {
  def main(args: Array[String]): Unit = {

    val n1 = Ticketer.getTicket

    val n2 = Ticketer.getTicket
  }
}
