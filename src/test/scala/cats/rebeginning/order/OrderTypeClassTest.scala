package cats.rebeginning.order;

import cats.implicits.{catsSyntaxOrder, catsSyntaxPartialOrder}

class OrderTypeClassTest extends munit.FunSuite {

    test("Fahrenheit derives Order with Order.from") {
        val f1 = Fahrenheit(32)
        val f2 = Fahrenheit(32)
        val f3 = Fahrenheit(212)

        assertEquals(f1.compare(f2), 0)
        assertEquals(f1.compare(f3), -1)
        assertEquals(f3.compare(f1), 1)

        assertEquals(f1 < f2, false)
        assertEquals(f1 <= f2, true)
        assertEquals(f1 > f2, false)
        assertEquals(f1 >= f2, true)
    }
}
