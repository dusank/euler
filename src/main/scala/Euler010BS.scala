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

object Euler010BS
{
  def main(args: Array[String]) {
    val sieve = scala.collection.mutable.BitSet.empty

    for (i <- 2 to 2000000) {
      sieve += i
    }

    for (i <- 2 to 2000000 / 2) {
      for (j <- (i * 2) to 2000000 by i) {
        sieve -= j
      }
    }

    var sum : Long = 0l

    for (i <- sieve) {
      sum += i
    }

    println(sum)
  }
}
