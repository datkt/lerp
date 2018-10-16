package test

import lerp.*
import ktape.*

fun main(args: Array<String>) {
  test("lerp", fun(t: Runner) {
    val x = 1.0
    val y = 2.0
    val z = lerp(x, y, 1.0)
    t.ok(1.0 == z, "lerp compute fail :shrug:")
    t.end(Error("Oops"))
  })
}
