package codility.scala.interview

object MultiplyAndGetNumberOfOnes extends App {

  // 50% correctness (I don't understand why)
  object Solution {

    final val BIT_1 = '1'

    def solution(a: Int, b: Int): Int = (a * b).toBinaryString.count(_ == BIT_1)

  }

  /* Some examples */
  import Solution._
  val res = solution(3, 7)
  System.out.println(res)

  val res1 = solution(0, 0)
  System.out.println(res1)

  val res2 = solution(2, 0)
  System.out.println(res2)

  val res3 = solution(3, 1)
  System.out.println(res3)

  val res4 = solution(2, 2)
  System.out.println(res4)

  val res5 = solution(-2147483648, 2147483647)
  System.out.println(res5)



}
