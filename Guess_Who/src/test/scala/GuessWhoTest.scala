import org.scalatest.FlatSpec

class GuessWhoTest extends FlatSpec{

  val GuessWhoGame = new GuessWhoGame
  val computerGuess = Person("Loki", "male", "grey", "brown", false, false)
  val testZoe = Person("Zoe", "female", "blonde", "grey", true, true)
  val testPersonCards: Seq[Person] = Seq(testZoe, computerGuess)

  "GuessWhoGame" should "return a random person" in {
    assert(GuessWhoGame.randomPerson == GuessWhoGame.randomPerson)
  }

  "GuessWhoGame" should "return a string if don't wear a hat" in {
    assert(GuessWhoGame.wearsAHat(computerGuess) == "Nope, they don't wear a hat!")
  }

  "GuessWhoGame" should "return a string if do wear a hat" in {
    assert(GuessWhoGame.wearsAHat(testZoe) == "Yes, they do wear a hat!")
  }

  "GuessWhoGame" should "return a string if don't wear glasses" in {
    assert(GuessWhoGame.wearsGlasses(computerGuess) == "No, they don't wear glasses!")
  }

  "GuessWhoGame" should "return a string if do wear glasses" in {
    assert(GuessWhoGame.wearsGlasses(testZoe) == "Yes, they do wear glasses!")
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

  "GuessWhoGame" should "return a string if guessed gender is correct" in {
    val guessedGender = GuessWhoGame.genderCorrect("female", testZoe)
    val correctGuess = "You're right! They are female"
    assert(guessedGender == correctGuess)
  }

  "GuessWhoGame" should "return a string if guessed gender is incorrect" in {
    val guessedGender = GuessWhoGame.genderCorrect("female", computerGuess)
    val incorrectGuess = "Nope, they're not female"
    assert(guessedGender == incorrectGuess)
  }

  "GuessWhoGame" should "return a string if guessed hair colour is correct" in {
    val guessedHairColour = GuessWhoGame.hairColourCorrect("grey", computerGuess)
    val correctGuess = "You're right! They are grey"
    assert(correctGuess == guessedHairColour)
  }

  "GuessWhoGame" should "return a string if guessed hair colour is incorrect" in {
    val guessedHairColour = GuessWhoGame.hairColourCorrect("blonde", computerGuess)
    val incorrectGuess = "Nope, they're not blonde"
    assert(incorrectGuess == guessedHairColour)
  }

  "GuessWhoGame" should "return a string if guessed eye colour is correct" in {
    val guessedEyeColour = GuessWhoGame.eyeColourCorrect("brown", computerGuess)
    val correctGuess = "You're right! They do have brown eyes!"
    assert(correctGuess == guessedEyeColour)
  }

  "GuessWhoGame" should "return a string if guessed eye colour is incorrect" in {
    val guessedEyeColour = GuessWhoGame.eyeColourCorrect("grey", computerGuess)
    val incorrectGuess = "Nope, they don't have grey eyes!"
    assert(incorrectGuess == guessedEyeColour)
  }


}
