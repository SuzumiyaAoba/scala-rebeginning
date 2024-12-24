package cats.rebeginning.eq

import cats.implicits.catsSyntaxEq

class EqTypeClassTest extends munit.FunSuite {

  test("Point2D derives Eq with Eq.fromUniversalEquals") {
    val p1 = Point2D(1, 2)
    val p2 = Point2D(1, 2)
    val p3 = Point2D(1, 3)

    assertEquals(p1 === p2, true)
    assertEquals(p1 === p3, false)

    assertEquals(p1.eqv(p2), true)
    assertEquals(p1.eqv(p3), false)

    assertEquals(p1 =!= p2, false)
    assertEquals(p1 =!= p3, true)

    assertEquals(p1.neqv(p2), false)
    assertEquals(p1.neqv(p3), true)
  }

  test("Point3D derives Eq with kittens") {
    val p1 = Point3D(1, 2, 3)
    val p2 = Point3D(1, 2, 3)
    val p3 = Point3D(1, 2, 4)

    assertEquals(p1 === p2, true)
    assertEquals(p1 === p3, false)

    assertEquals(p1.eqv(p2), true)
    assertEquals(p1.eqv(p3), false)

    assertEquals(p1 =!= p2, false)
    assertEquals(p1 =!= p3, true)

    assertEquals(p1.neqv(p2), false)
    assertEquals(p1.neqv(p3), true)
  }
}
