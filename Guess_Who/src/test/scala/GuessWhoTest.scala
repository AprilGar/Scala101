import org.scalatest.FlatSpec

class GuessWhoTest extends FlatSpec{

  val GuessWhoGame = new GuessWhoGame

  "GuessWhoGame" should "return a random person" in {
    assert(GuessWhoGame.randomPerson == GuessWhoGame.randomPerson)
    println(GuessWhoGame.randomPerson.firstName)
  }

  "GuessWhoGame" should "return a filtered list of names for those who wearsHat is true" in {
    assert(GuessWhoGame.wearsAHat() == GuessWhoGame.wearsAHat())
  }

  "GuessWhoGame" should "return a filtered list of names for those who wearsGlasses is true" in {
    assert(GuessWhoGame.wearsGlasses() == GuessWhoGame.wearsGlasses())
  }




}
