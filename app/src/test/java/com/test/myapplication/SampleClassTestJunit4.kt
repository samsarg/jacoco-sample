package com.test.myapplication

import junit.framework.Assert.assertEquals
import org.junit.Test


class SampleClassTestJunit4 {

  private val sut = SampleClass()

  @Test
  fun `adding numbers works as expected`() {
    val actual = sut.add(3, 2)
    assertEquals(actual, 5)
  }
}