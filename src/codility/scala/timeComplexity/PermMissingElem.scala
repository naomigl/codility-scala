package codility.scala.timeComplexity

/**
 * Finds the longest sequence of zeros in binary representation of an integer.
 */
object PermMissingElem extends App {

  // Max score 70%
  object Solution {
    def solution(a: Array[Int]): Int = {
      val wholeArray = 1 to a.length + 1
      wholeArray
        .find(
          elem => !a.contains(elem)
        ).get
    }

  }

  /* Some examples */
  import Solution._
  val res = solution(Array(2, 3, 1, 5))
  System.out.println(res)

  val res1 = solution(Array())
  System.out.println(res1)

  val res2 = solution(Array(2))
  System.out.println(res2)

}
