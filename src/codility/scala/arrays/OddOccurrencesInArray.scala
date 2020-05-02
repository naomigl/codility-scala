package codility.scala.arrays

/**
 * Finds the longest sequence of zeros in binary representation of an integer.
 */
object OddOccurrencesInArray extends App {

  // Max score 88%
  object Solution {
    def solution(a: Array[Int]): Int = {
      a
        .groupBy(x => x)
        .find(_._2.length % 2 == 1)
        .get._1
    }
  }

  /* Some examples */
  import Solution._
  val res = solution(Array(9, 3, 9, 3, 9, 7, 9))
  System.out.println(res)

  val res1 = solution(Array(1))
  System.out.println(res1)

  val res3 = solution(Array(9, 3, 9, 3, 9, 9, 9))
  System.out.println(res3)
}
