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

// 142913828922

import Lib._

object Euler010
{
  def main(args: Array[String]) {
    computeSieve(2000000)

    val list = (2l to 2000000l) filter isPrime
    println(list)
    println(list.sum)

    var sum : Long = 0l

    for (i <- list) {
      sum += i
    }

    println(sum)
  }
}
