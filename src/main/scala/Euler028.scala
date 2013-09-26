/************************************************************************\
** Project ____   __  __   __     ____    ______                        **
**        / __/  / / / /  / /    / __/   / __  /      (c) 2013          **
**       / /_   / / / /  / /    / /_    / /_/ /                         **
**      / __/  / / / /  / /    / __/   / __  /   Dusan.Kysel@gmail.com  **
**     / /__  / /_/ /  / /__  / /__   / / | |                           **
**    /____/ /_____/  /____/ /____/  /_/  |_|     All rights reserved.  **
**                                                                      **
**  Redistribution and use permitted under the BSD 2-Clause license.    **
**                                                                      **
\************************************************************************/

// 669171001

object Euler028
{
  val SIZE = 1001
  val m = Array.fill[Int](SIZE, SIZE)(0)
  val iter = (1 to Integer.MAX_VALUE).toIterator

  def set(left: Int, right: Int, up: Int, mid: Int, down: Int) {
     for (j <- mid to down)		m(j)(right) = iter.next
     for (i <- right - 1 to left by -1)	m(down)(i) = iter.next
     for (j <- down - 1 to up by -1)	m(j)(left) = iter.next
     for (i <- left + 1 to right)	m(up)(i) = iter.next
  }

  def main(args: Array[String]) {

    m(500)(500) = iter.next
    var left = 499
    var right = 501
    var up = 499
    var mid = 500
    var down = 501

//    set(499, 501, 499, 500, 501)
//    set(498, 502, 498, 499, 502)
    do {
      set(left, right, up, mid, down)

      left -= 1
      right += 1
      up -= 1
      mid -= 1
      down += 1
    } while (left >= 0)

    for (i <- 490 to 510) {
      for (j <- 490 to 510) {
        val v = m(i)(j).toString
        print(" " * (4 - v.length) + v + " ")

      }
      println
    }

    var sum = 0

    for (i <- 0 to 1000) {
      sum += m(i)(i)
      sum += m(1000 - i)(i)
    }
    sum -= m(500)(500)

    println()
    println(sum)
  }
}
