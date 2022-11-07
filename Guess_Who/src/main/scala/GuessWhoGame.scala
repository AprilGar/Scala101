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

  def wearsAHat(): Unit = {
    personCards.filter {
      person => person.wearsHat == true
    }
  }

  def wearsGlasses(): Unit = {
    personCards.filter {
      person => person.wearsGlasses == true
    }
  }



}
