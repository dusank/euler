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

// 100

import Lib._

object Euler033
{
  def main(args: Array[String]) {
    var num = 1l
    var den = 1l

    for (n <- 10 to 99) {
      for (d <- 10 to 99) {
        if (n < d && (n % 10 != 0 || d % 10 != 0)) {

          val n1 = n / 10
          val n2 = n % 10

          val d1 = d / 10
          val d2 = d % 10

          if (n1 == d2 && (0.0 + n2) / d1 == (0.0 + n) / d) {
            println(n + " / " + d)
            num = num * n
            den = den * d
          }
          if (n2 == d1 && (0.0 + n1) / d2 == (0.0 + n) / d) {
            println(n + " / " + d)
            num = num * n
            den = den * d
          }
        }
      }
    }

    val g = BigInt(num) gcd BigInt(den)
    println("fraction = " + num + " / " + den)
    println("gcd = " + g)
    println("fraction in lowest common terms = " + num / g + " / " + den / g)
  }
}
