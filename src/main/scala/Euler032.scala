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

// 45228

import Lib._

object Euler032
{
  def concat(a : Long, b : Long) : Long = {
    var aa = a
    var bb = b

    while (bb > 0) {
        aa = aa * 10
        bb = bb / 10
    }

    aa + b
  }

  def main(args: Array[String]) {

    var products = Set[Long]()

    for (m <- 2 until 100) {
      val from = if (m > 9) 123 else 1234
      val to = 10000 / m + 1

      for (n <- from until to) {
        val prod = m * n;
        val compiled = concat(concat(prod, n), m)

        if (compiled >= 1e8 && compiled < 1e9 && isPandigital(compiled)) {
          products += prod
        }
      }
    }

    var sum = 0l

    for (i <- products) {
      sum += i
    }

    println(sum)
  }
}
