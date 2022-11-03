object playground extends App {

//  New boats

  val boat1 = new Boat(700, 300, 8)
  val boat2 = new Boat(500, 200, 12)

  val luxurySailBoat1 = new LuxurySailBoat(true, true) {
    override val name: String = "Fitz"
    override val location: String = "Germany"
  }
  val AA = new LuxurySailBoat(true, false)

  val theBlackPearl = new PirateShip(2)
  val theFunkyGoose = new PirateShip(4)

  val PacerBoat1 = new PacerBoat("Toyota", 10) {
    override val engineSize: Int = 2500
    override val fuelType: String = "methane"
  }

  val sailBoat1 = new SailBoat(2, false, true) {
    override val length: Int = 500
    override val width: Int = 200
    override val topSpeed: Int = 12
  }

//  Using methods

  theBlackPearl.canonFire("Chocolate bomb")

  println("Can out gun? ", theBlackPearl.canOutGun(theFunkyGoose))

  PacerBoat1.canFloat(PacerBoat1)

  println("Is faster? ", boat1.isFasterThan(sailBoat1))

  println("Fun? ", luxurySailBoat1.isFun())
  println(s"Fun? ${AA.isFun()}" )

}
