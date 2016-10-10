package acme

import logging._

class Store(initialStock: Int) extends ConsoleLogger {
  private var inStock = 0
  widgetsInStock = initialStock

  // properties (getters and setters)
  def widgetsInStock = inStock
  def widgetsInStock_=(newValue: Int) = {
    require(newValue >= 0, "Out of stock!")
    inStock = newValue
  }

  def order(numWidgets: Int) =  {
    info("Order arrived...")
    widgetsInStock -= numWidgets
    info(s"Order complete -- widgets in stock: $widgetsInStock")
  }
}
