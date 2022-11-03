class Boat (val length: Int, val width: Int, val topSpeed: Int){

    def canFloat(boat: Boat): Unit = {
        println(s"Bobbing along at ${boat.topSpeed}mph")
    }

    def isFasterThan (boat: Boat): Boolean = {
        topSpeed > boat.topSpeed
    }

}

trait Artillery {
    val numGuns: Int = 0
    val range: Int = 0
}

trait RenownedDesigner {
    val name: String = "name"
    val location: String = "location"
}



