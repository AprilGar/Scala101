  class PirateShip (val numGangPlanks: Int) extends SailBoat (2, false, false) {

    def canonFire(missileOfChoice: String): Unit = {
      println(s"$missileOfChoice has successfully been fired!")
    }

    def canOutGun(pirateShip: PirateShip): Boolean = {
      numGangPlanks > pirateShip.numGangPlanks
    }

  }
