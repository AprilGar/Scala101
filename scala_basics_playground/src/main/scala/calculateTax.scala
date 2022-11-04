class calculateTax {

  def calculateTax(x: Double): Double = {
    if (x <= 10000) {
      x * 0.1
    } else if (x <= 50000) {
      x * 0.15
    } else if (x <= 100000) {
      x * 0.2
    } else {
      x * 0.4
    }
  }

}
