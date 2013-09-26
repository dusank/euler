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

// -59231

import Lib._

object Euler027
{
  def f(a: Int, b: Int, n: Int) : Int = n * n + a * n + b

  def primes(a: Int, b: Int) : Int = {
    var i = -1
    var p = 0

    do {
      i += 1
      p = f(a, b, i)
    } while (isPrime(Math.abs(p)))
     
    i
  }

  def main(args: Array[String]) {
    var max, ar, br = 0

    for (a <- -999 to 999) {
      for (b <- -999 to 999) {
        val p = primes(a, b)
        if (p > max) {
          max = p
          ar = a
          br = b
          val ab = a * b
          println("primes = " + p + ", a = " + ar + ", b = " + br + ", a * b = " + ab)
        }
      }
    }
  }
}
