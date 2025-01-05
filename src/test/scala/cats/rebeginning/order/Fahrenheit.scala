package cats.rebeginning.order

import cats.Order

case class Fahrenheit(value: Double)

given Order[Fahrenheit] = Order.from((x, y) => x.value.compareTo(y.value))