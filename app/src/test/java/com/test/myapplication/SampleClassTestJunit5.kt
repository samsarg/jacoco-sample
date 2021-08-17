package com.test.myapplication

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SampleClassTestJunit5 {

  private val sut = SampleClass()

  @Test
  fun `adding numbers works as expected`() {
    val actual = sut.add(3, 2)
    assertEquals(actual, 5)
  }
}