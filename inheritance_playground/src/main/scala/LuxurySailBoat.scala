class LuxurySailBoat (val hasJacuzzi: Boolean, val hasBooze: Boolean) extends SailBoat (2, false, true) with RenownedDesigner {

  def isFun(): String = {
    if(hasBooze){
      "Yeah!!"
    } else {
      "Probably not..."
    }
  }

}

