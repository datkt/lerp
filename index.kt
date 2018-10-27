package datkt.lerp

fun lerp(x: Double, y: Double, t: Double): Double {
  return x*(1-t)+y*t
}
