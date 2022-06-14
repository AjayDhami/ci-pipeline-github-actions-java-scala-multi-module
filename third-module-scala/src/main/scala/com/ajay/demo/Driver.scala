package com.ajay.demo

import com.ajay.demo.DriverUtils._

object Driver {

  def main(args: Array[String]): Unit = {
    println("CI pipeline for third module scala project")

    println("Sum: " + sumTwoNumbers(50, 10))
    println("Subtract: " + subtractTwoNumbers(50, 10))
    println("Multiply: " + multiplyTwoNumbers(50, 10))

  }


}
