object MyMath {

  def sqrt(n: Int) = Math.sqrt(n)

  def pow(n: Int, p: Int) = Math.pow(n,p)
}

MyMath.sqrt(10)
MyMath.pow(2, 5)


object DeviceType {
  val ANDROID = 1
  val IOS = 2
  val PC = 3
}

DeviceType.ANDROID
DeviceType.IOS
DeviceType.PC
