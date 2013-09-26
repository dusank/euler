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

// 31626

import Lib._

object Euler021
{
  def main(args: Array[String]) {
    var sum = 0l

    for (i <- 2 until 10000) {
      val j = divisorSum(i)
      if (j > i && i == divisorSum(j)) {
        sum += i + j
      }
    }

    println(sum)
  }
}
