package codes.quine.labo.template

class HelloSuite extends munit.FunSuite {
  test("Hello.world") {
    assertEquals(Hello.world, "Hello World")
  }
}
