package acme

class Store(var widgetsInStock: Int) {
  def order(numWidgets: Int) =  {
    widgetsInStock -= numWidgets
  }
}
