package cats.rebeginning.eq

import cats.kernel.Eq

case class Point2D(x: Int, y: Int)

implicit val eqPint2D: Eq[Point2D] = Eq.fromUniversalEquals
