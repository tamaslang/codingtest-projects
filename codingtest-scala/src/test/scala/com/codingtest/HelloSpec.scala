package com.codingtest

import org.scalatest.{WordSpec}
import org.scalatest.Matchers

class HelloSpec extends WordSpec with Matchers {

  "hello" should {
    "say hello" in {
      Hello.sayHello shouldBe "hello"
    }
  }
}
