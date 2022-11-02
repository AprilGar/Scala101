def getBigVal (input1: Int, input2: Int): String = {
  if (input1 > input2){
    return "first"
  } else if (input1 < input2) {
    return "second"
  } else if (input1 == input2) {
    return "same"
  } else {
    return "something has gone wrong here..."
  }
}
getBigVal(4,4)

def nameLength(firstName: String, surname: String): Int = {
  if(firstName.length() > surname.length()){
    return firstName.length()
  } else if (firstName.length() < surname.length()){
    return surname.length()
  } else {
    return 0
  }
}
nameLength("Loki", "Garlington")