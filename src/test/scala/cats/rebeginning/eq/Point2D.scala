package cats.rebeginning.eq

import cats.kernel.Eq

case class Point2D(x: Int, y: Int)

given Eq[Point2D] = Eq.fromUniversalEquals
