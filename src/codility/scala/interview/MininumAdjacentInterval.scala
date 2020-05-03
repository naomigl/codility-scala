package codility.scala.interview

object MininumAdjacentInterval extends App {

  // 100% correctness but 0% performance which was the focus of this exercise
  object Solution {

    final val NO_ADJACENT_INDEXES_FOUND = -1

    def solution(a: Array[Int]): Int = {

      def isAdjacent(i1: Int, i2: Int): Boolean = {
        val i1Value = a(i1)
        val i2Value = a(i2)
        val minimum = math.min(i1Value, i2Value)
        val maximum = math.max(i1Value, i2Value)

        a(i1) != a(i2) && a.forall(el => el >= maximum || el <= minimum)
      }

      def getDistance(interval: (Int, Int)): Int = math.abs(interval._1 - interval._2)

      def getAdjacentDistances: List[Int] = {
        (
          for {
            i1 <- 0 until a.length - 1
            i2 <- 1 until a.length
            if i1 < i2 && isAdjacent(i1, i2)
          } yield getDistance(i1, i2)
        ).toList
      }

      val distances = getAdjacentDistances

      if (distances.isEmpty) NO_ADJACENT_INDEXES_FOUND
      else distances.min
    }
  }

  /* Some examples */
  import Solution._
  val res = solution(Array(0, 1, 3, 3, 7, 5, 3, 11, 1))
  System.out.println(res)

  val res1 = solution(Array(0, 0))
  System.out.println(res1)

  val res2 = solution(Array(0))
  System.out.println(res2)

  val res3 = solution(Array(-2, 1, 20, 1, 1, 1, 147, -1, 3, 3, 149, 0))
  System.out.println(res3)


}
