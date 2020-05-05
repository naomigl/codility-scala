package codility.scala.iterations

object BinaryGap extends App {

  // Max score 100%
  object Solution {

    final val BIT_1 = "1"

    def solution(n: Int): Int = {
      val nToBinary = n.toBinaryString

      val a = nToBinary.indexOf(BIT_1)
      val b = nToBinary.lastIndexOf(BIT_1)

      if (a >= 0 && b > 0 ) {
        val betweenOnes = nToBinary.slice(a + 1, b)
        val numberOfZerosInGroups = betweenOnes.split(BIT_1).map(_.length)
        if(numberOfZerosInGroups.isEmpty) 0
        else numberOfZerosInGroups.max
      } else {
        0
      }
    }
  }

  /* Some examples */
  import Solution._
  solution(15) // 1111
  solution(9) // 1001
  solution(529) // 1000010001
  solution(6) // 110
  solution(328) // 101001000
  solution(16) // 10000
  solution(1024) // 10000000000
  solution(51712) // 110010100000000

}
