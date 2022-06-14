package com.ajay.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.scalatest.flatspec.AnyFlatSpec

class DriverUtilsIntegrationSpec extends AnyFlatSpec {

  it should "Multiply two numbers" in {
    assertEquals(500, DriverUtils.multiplyTwoNumbers(50, 10))
  }

}
