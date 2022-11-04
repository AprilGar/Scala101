import scala.util.Random

class GuessWhoGame {

  val random_name = new Random

  val zoe = new Person("Zoe","female", "blonde", "grey", false, true)
  val russell = new Person("Russell", "male", "brown", "brown", true, false)
  val loki = new Person("Loki", "male", "grey", "brown", false, false)
  val moose = new Person("Moose", "male", "brown", "brown", true, true)
  val maple = new Person("Maple", "female", "ginger", "brown", false, false)

  val personCards: Seq[Object] = Seq (zoe, russell, loki, moose, maple)

}
