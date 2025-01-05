package cats.rebeginning.order

import cats.derived.*
import cats.Order

case class Celsius(value: Double) derives Order
