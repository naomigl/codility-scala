package codility.scala.timeComplexity

/**
 * Finds the longest sequence of zeros in binary representation of an integer.
 */
object FrogJmp extends App {

  // Max score 100%
  object Solution {
    def solution(x: Int, y: Int, d: Int): Int = {
      val distanceToJump = y - x
      math.ceil(distanceToJump.toDouble / d).toInt
    }
  }

  /* Some examples */
  import Solution._
  val res = solution(10, 85, 30)
  System.out.println(res)

  val res2 = solution(10, 41, 30)
  System.out.println(res2)

  val res3 = solution(10, 10, 30)
  System.out.println(res3)

  val res4 = solution(10, 40, 30)
  System.out.println(res4)

}
