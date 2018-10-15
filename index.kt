package lerp

fun lerp(x: Float, y: Float, t: Float): Float {
  return x*(1-t)+y*t
}
