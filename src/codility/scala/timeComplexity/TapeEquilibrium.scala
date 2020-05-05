package codility.scala.timeComplexity

object TapeEquilibrium extends App {

  // Max score 53%: 100% correctness 0% performance
  object Solution {
    def solution(a: Array[Int]): Int = {
      val n = a.length
      val differences = for {
        p <- 1 until n
      } yield math.abs(a.slice(0, p).sum - a.slice(p, n).sum)

      differences.min
    }
  }

  /* Some examples */
  import Solution._
  val res = solution(Array(3, 1, 2, 4, 3))
  System.out.println(res)

  val res1 = solution(Array(3, 5))
  System.out.println(res1)

  val res2 = solution(Array(-1, 0))
  System.out.println(res2)

}
