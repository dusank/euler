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

// 76576500 <- 576

object Euler012
{
  def divisors(l: Long) : Int = {
    var i = 1l
    var d = 0

    while (i <= Math.sqrt(l))  {
      if (l % i == 0) {
        if (l == i * i) {
	  d += 1
        } else {
          d += 2
        }
//        println(i + " divides " + l)
      }
      i += 1
    }
    return d;
  }

  def main(args: Array[String]) {
    var i = 0l
    var sum = 0l
    var maxDivisors = 0

    while (divisors(sum) <= 500) {
      i += 1
      sum += i

      val d = divisors(sum)
      if (d > maxDivisors) {
        println(sum + " <- " + divisors(sum))
        maxDivisors = d
      }
    }

    println
    println(sum + " <- " + divisors(sum))
  }
}
