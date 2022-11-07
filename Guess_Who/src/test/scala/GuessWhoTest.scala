import org.scalatest.FlatSpec

class GuessWhoTest extends FlatSpec{

  val GuessWhoGame = new GuessWhoGame

  "GuessWhoGame" should "return a random person" in {
    assert(GuessWhoGame.randomPerson == GuessWhoGame.randomPerson)
    println(GuessWhoGame.randomPerson.firstName)
  }



}
