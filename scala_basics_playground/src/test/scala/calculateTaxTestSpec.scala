import org.scalatest.FlatSpec

class calculateTaxTestSpec extends FlatSpec {

  val calculateTax = new calculateTax

  "calculateTax" should "return 10% of x if x is < 100" in {
    assert(calculateTax.calculateTax(100) == 10)
  }

  "calculateTax" should "return 10% of x if x is = 10000" in {
    assert(calculateTax.calculateTax(10000) == 1000)
  }

  "calculateTax" should "return 15% of x if x is 10000 < 50000" in {
    assert(calculateTax.calculateTax(30000) == 4500)
  }

  "calculateTax" should "return 15% of x if x is = 50000" in {
    assert(calculateTax.calculateTax(50000) == 7500)
  }

  "calculateTax" should "return 20% of x if x is 50000 < 100000" in {
    assert(calculateTax.calculateTax(70000) == 14000)
  }

  "calculateTax" should "return 20% of x if x is = 100000" in {
    assert(calculateTax.calculateTax(100000) == 20000)
  }

  "calculateTax" should "return 40% of x if x is > 100000" in {
    assert(calculateTax.calculateTax(110000) == 44000)
  }

  "calculateTax" should "return 0 if x = 0" in {
    assert(calculateTax.calculateTax(0) == 0)
  }

  "calculateTax" should "return 10% of x if x is a decimal < 10000" in {
    assert(calculateTax.calculateTax(150.7) == 15.07)
  }

}
