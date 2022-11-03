import org.scalatest.FlatSpec

class FizzBuzzTestSpec extends FlatSpec {

  val FizzBuzz = new FizzBuzz

  "FizzBuzz" should "if divisible by 3 return fizz" in {
    assert(FizzBuzz.fizzBuzz(3) == "Fizz")
  }

  "FizzBuzz" should "if divisible by 5 return buzz" in {
    assert(FizzBuzz.fizzBuzz(5) == "Buzz")
  }

  "FizzBuzz" should "if divisible by 3 and 5 return FizzBuzz" in {
    assert(FizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }

  "FizzBuzz" should "if not divisible by 3 or 5 return original number" in {
    assert(FizzBuzz.fizzBuzz(13) == "13")
  }

}


