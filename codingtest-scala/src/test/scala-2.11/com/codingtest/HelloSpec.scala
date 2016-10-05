package com.codingtest

import org.scalatest.{ShouldMatchers, WordSpec}

class HelloSpec extends WordSpec with ShouldMatchers{
  "hello" should {
    "say hello" in {
      Hello.sayHello shouldBe "hello"
    }
  }
}
