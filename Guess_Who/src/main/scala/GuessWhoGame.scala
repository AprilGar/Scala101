import scala.util.Random

class GuessWhoGame {

  val random = new Random

  val zoe = Person("Zoe","female", "blonde", "grey", false, true)
  val russell = Person("Russell", "male", "brown", "brown", true, false)
  val loki = Person("Loki", "male", "grey", "brown", false, false)
  val moose = Person("Moose", "male", "brown", "brown", true, true)
  val maple = Person("Maple", "female", "ginger", "brown", false, false)
  val personCards: Seq[Person] = Seq (zoe, russell, loki, moose, maple)

  val randomPerson = personCards(random.nextInt(personCards.length))

  def wearsAHat(ComputerGuess: Person): String = {
    if (ComputerGuess.wearsHat){
      personCards.filter {
        _.wearsHat
      }
      "Yes, they do wear a hat!"
    } else {
      personCards.filter {
        person => !person.wearsHat
      }
      "Nope, they don't wear a hat!"
    }
  }

  def wearsGlasses(computerGuess: Person): String = {
    if (computerGuess.wearsGlasses){
      personCards.filter {
        person => person.wearsGlasses}
          "Yes, they do wear glasses!"
      } else {
      personCards.filter {
        person => !person.wearsGlasses
      }
      "No, they don't wear glasses!"
      }
    }

  def firstNameCorrect(firstName: String, computerGuess: Person): String = {
    if (firstName == computerGuess.firstName) {
      "You're right! Woo!"
    } else {
      personCards.filter {
        person => person.firstName != firstName
      }
      "Not correct, try again!"
    }
  }

  def genderCorrect(gender:String, computerGuess: Person): String = {
    if (computerGuess.gender  == gender) {
      personCards.filter {
        person => person.gender == gender
      }
      s"You're right! They are $gender"
    } else {
      personCards.filter {
        person => person.gender != gender
      }
      s"Nope, they're not $gender"
    }
  }

  def hairColourCorrect(hairColour: String, computerGuess: Person): String = {
    if (computerGuess.hairColour == hairColour) {
      personCards.filter {
        person => person.hairColour == hairColour
      }
      s"You're right! They are $hairColour"
    } else {
      personCards.filter {
        person => person.hairColour != hairColour
      }
      s"Nope, they're not $hairColour"
    }
  }

  def eyeColourCorrect(eyeColour: String, computerGuess: Person): String = {
    if (computerGuess.eyeColour == eyeColour) {
      personCards.filter {
        person => person.eyeColour == eyeColour
      }
      s"You're right! They do have $eyeColour eyes!"
    } else {
      personCards.filter {
        person => person.eyeColour != eyeColour
      }
      s"Nope, they don't have $eyeColour eyes!"
    }
  }

}
