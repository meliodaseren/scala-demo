class ComplexNum(val real: Float, val imaginary: Float) {

  def +(that: ComplexNum): ComplexNum = {
    new ComplexNum(real + that.real, imaginary + that.imaginary)
  }
  override def toString = s"ComplexNum($real, $imaginary)"
}

val a = new ComplexNum(2, 5)
val b = new ComplexNum(1, -3)

val c = a.+(b)
println(c)

val d = a + b
println(d)