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

// 6857

import Lib._

object Euler003
{
  val C = 600851475143l

  def main(args: Array[String]) {
    var i = 2l
    var res = 0l
    val limit = Math.sqrt(C).toInt
    computeSieve(limit)

    while (i < limit)  {
      if (C % i == 0) {
        if (isPrime(i)) {
          res = i
          println(res)
        }
      }
      i += 1
    }

    println()
    println(res)
  }
}
