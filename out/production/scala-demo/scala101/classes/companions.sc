class Pizza private (val pizzaType: String) {
  override def toString = s"(Pizza: $pizzaType)"
}

object Pizza {
  private var counter = 0

  def apply(pizzaType: String): Pizza = {
    if (Pizza.counter < 5) {
      Pizza.counter += 1
      new Pizza(pizzaType)

    } else {
      null
    }
  }
}

Pizza("chicken")
Pizza("chicken")
Pizza("Seafood")
Pizza("Seafood")
Pizza("BBQ")
Pizza("BBQ")