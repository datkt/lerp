package test

import lerp.*
import tape.test
import tape.Test

class Beep: Throwable()

fun main(args: Array<String>) {
  test("lerp", fun(t: Test) {
    val x = 1.0
    val y = 2.0
    val z = lerp(x, y, x)
    t.ok(y == z, "y == lerp(x, y, x)")
    t.end()
  })

  tape.collect()
}
