package test

import lerp.*
import tape.test
import tape.Test

fun main(args: Array<String>) {
  test("lerp(Double, Double, Double) -> Double", fun(t: Test) {
    val x = 1.0
    val y = 2.0
    val z = lerp(x, y, x)
    t.equal(y, z, "y == lerp(x, y, x)")
    t.end()
  })

  tape.collect()
}
