package codility.scala.interview

object CropForumMessages extends App {

  // 100% correctness which was the focus of this exercise
  object Solution {

    def trimLastChar(str: String): String = {
      if(str.isEmpty) str
      else {
        str.last match {
          case ' ' => str.dropRight(1)
          case _ => str
        }
      }
    }

    def solution(message: String, k: Int): String = {
      val wordsInOriginalMessage = message.split(" ")

      val croppedMessage = message.slice(0, k)
      val lastWordInCroppedMessage = croppedMessage.split(" ").last

      val finalMessage =
        if(wordsInOriginalMessage.contains(lastWordInCroppedMessage)) croppedMessage
        else croppedMessage.dropRight(lastWordInCroppedMessage.length)

      trimLastChar(finalMessage)
    }
  }

  /* Some examples */
  import Solution._
  val res = solution("Codility We test coders", 14)
  System.out.println(res)

  val res1 = solution("Why not", 100)
  System.out.println(res1)

  val res2 = solution("The quick brown fox jumps over the lazy dog", 39)
  System.out.println(res2)

  val res3 = solution("The quick brown fox jumps over the lazy dog", 1)
  System.out.println(res3)

}
