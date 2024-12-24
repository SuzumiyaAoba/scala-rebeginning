package cats.rebeginning.eq

import cats.derived.*
import cats.kernel.Eq

case class Point3D(x: Int, y: Int, z: Int) derives Eq
