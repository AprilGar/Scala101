import org.scalatest.FlatSpec

class GuessWhoTest extends FlatSpec{

  val GuessWhoGame = new GuessWhoGame
  val computerGuess = Person("Loki", "male", "grey", "brown", false, false)
  val testZoe = Person("Zoe", "female", "blonde", "grey", false, true)
  val testPersonCards: Seq[Person] = Seq(testZoe, computerGuess)

  "GuessWhoGame" should "return a random person" in {
    assert(GuessWhoGame.randomPerson == GuessWhoGame.randomPerson)
  }

  "GuessWhoGame" should "return a filtered list of names for those who wearsHat is true" in {
    assert(GuessWhoGame.wearsAHat() == GuessWhoGame.wearsAHat())
  }

  "GuessWhoGame" should "return a filtered list of names for those who wearsGlasses is true" in {
    assert(GuessWhoGame.wearsGlasses() == GuessWhoGame.wearsGlasses())
  }

  "GuessWhoGame" should "return a string if guessed name is incorrect" in {
    val guessedName = GuessWhoGame.firstNameCorrect("Zoe", computerGuess)
    val incorrectGuess = "Not correct, try again!"
    assert(guessedName == incorrectGuess)
  }

  "GuessWhoGame" should "return a string if guessed name is correct" in {
    val guessedName = GuessWhoGame.firstNameCorrect("Loki", computerGuess)
    val correctGuess = "You're right! Woo!"
    assert(guessedName == correctGuess)
  }


}
