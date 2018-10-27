datkt.lerp
==========

Simple linear interpolation function for Kotlin

## Installation

```sh
$ npm install datkt/lerp
```

## Usage

```sh
$ konanc -r node_modules/@datkt -l lerp/lerp index.kt
$ ./program.kexe
```

```kotlin
import datkt.lerp.*

fun main(args: Array<String>) {
  val x = toDouble(0, args, 0.123)
  val y = toDouble(1, args, 0.456)
  val t = toDouble(2, args, 0.5)

  println("lerp(${x}, ${y}, ${t})=${lerp(x, y, t)}")
}

fun toDouble(i: Int, args: Array<String>, default: Double): Double {
  val n = if (args.size > i + 1) args[i] else null

  if (null != n && n.length > 0) {
    return n.toDouble()
  }

  return default
}
```

## API

### `val z = lerp(x: Double, y: Double, t: Double): Double`

Compute the linear interpolation between two points `x` and `y` with a
factor of `t`.

```kotlin
val z = lerp(1.0, 2.0, 1.0) // z=2.0
```

## License

MIT
