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

// 906609

import Lib._

object Euler004
{
  def main(args: Array[String]) {

    var m = 0

    for (i <- 100 to 999) {
      for (j <- 100 to 999) {
        val prod = i * j

        if (isPalindrome(prod.toString)) {
          m = prod max m
        }
      }
    }
    println(m)
  }
}
