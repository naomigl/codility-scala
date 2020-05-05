package codility.scala.arrays

object CyclicRotation extends App {

  // Max score 100%
  object Solution {
    def solution(a: Array[Int], k: Int): Array[Int] = {
      if(a.isEmpty) a
      else {
        val numElems = a.length
        val numElemsToRotate = k % numElems
        val startPosition = numElems - numElemsToRotate
        val firstElems = a.slice(startPosition, numElems)
        val lastElems = a.slice(0, startPosition)

        firstElems ++ lastElems
      }
    }
  }

  /* Some examples */
  import Solution._
  val res = solution(Array(3, 8, 9, 7, 6), 3)
  System.out.println(res.mkString(", "))

  val res2 = solution(Array(0, 0, 0), 1)
  System.out.println(res2.mkString(", "))

  val res3 = solution(Array(3, 8, 9, 7, 6), 0)
  System.out.println(res3.mkString(", "))

  val res4 = solution(Array(), 0)
  System.out.println(res4.mkString(", "))

}
