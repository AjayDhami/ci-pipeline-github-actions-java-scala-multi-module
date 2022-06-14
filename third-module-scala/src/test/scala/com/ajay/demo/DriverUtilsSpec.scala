package com.ajay.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.scalatest.flatspec.AnyFlatSpec


class DriverUtilsSpec extends AnyFlatSpec {

  it should "Add two numbers" in {
    assertEquals(60, DriverUtils.sumTwoNumbers(50, 10))
  }

  it should "Subtract two numbers" in {
    assertEquals(40, DriverUtils.subtractTwoNumbers(50, 10))
  }

}
