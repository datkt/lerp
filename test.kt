package datkt.lerp.test

import datkt.tape.collect
import datkt.tape.test
import datkt.tape.Test
import datkt.lerp.*

fun main(args: Array<String>) {
  test("lerp(Double, Double, Double) -> Double", fun(t: Test) {
    val x = 1.0
    val y = 2.0
    val z = lerp(x, y, x)
    t.equal(y, z, "y == lerp(x, y, x)")
    t.end()
  })

  collect()
}
