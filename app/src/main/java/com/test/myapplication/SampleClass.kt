package com.test.myapplication

class SampleClass(
  val argumentWithTrailingComma: String = "",
) {

  fun add(x: Int, y: Int): Int {
    return x + y
  }

  fun minus(x: Int, y: Int): Int {
    return x - y
  }
}