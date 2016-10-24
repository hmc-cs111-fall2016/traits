package acme

object Program extends App {
  val CAPACITY = 100
  val store = new Store(CAPACITY)

  store.order(CAPACITY / 2)
  println(store.widgetsInStock)

  store.order(CAPACITY / 2)  // the store is now empty
  println(store.widgetsInStock)

  store.order(CAPACITY / 2)  // uh-oh!
  println(store.widgetsInStock)
}
