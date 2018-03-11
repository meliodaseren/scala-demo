/* Classes - continued */

// A full Java boilerplate style class (not idiomatic Scala!)
class JPerson() {
  var _name: String = null
  def this(_name:String) = {
    this()
    this._name = _name
  }
  // Scala style getters and setters
  def name_=(_name:String) = this._name = _name
  def name = this._name

  // Java style getters and setters
  def getName() = name
  def setName(name:String) = this.name = name
}

// Which can be generated in 1 line of idiomatic Scala
import beans._
class SPerson(@BeanProperty var name:String)
// Note: @BeanProperty is optional
// (only if you need Java style getters and setters)

val jp = new JPerson("Java Style")
val sp = new SPerson("Scala Style")

println(jp.name)
println(sp.name)

jp.name += " sucks!"
sp.name += " rocks!"

println(jp.getName)
println(sp.getName)
