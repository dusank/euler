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

// 872187

import Lib._

object Euler036
{
  def main(args: Array[String]) {

    var sum = 0

    for (i <- 0 until 1000000) {
      val b = i.toBinaryString
      val d = i.toString

      if (isPalindrome(b) && isPalindrome(d)) {
        println(b + " = " + d)
        sum += i
      }
    }

    println("Sum = " + sum)
  }
}
