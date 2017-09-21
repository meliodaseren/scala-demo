package ScalaProgramming.ch3

/* Case Class 不常定義成員函數 */
case class Teacher(id: String, name: String, age: Int)

case class SomeCaseClass(x: Int, y: Int)

object caseClass {

  def main(args: Array[String]): Unit = {

    val eren = Teacher("0000", "Eren", 25)

    // 上式等同於：
    val eren2 = Teacher.apply("0000", "Eren", 25)

    val a = SomeCaseClass(1, 2)
    val b = SomeCaseClass(1, 2)

    println(a == b)
  }
}

