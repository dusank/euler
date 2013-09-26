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

// 40730

import Lib._

object Euler034
{
  def main(args: Array[String]) {
    var result = 0

    for (i <- 10 to 2540161) {
      var number = i
      var sum = 0

      while (number > 0) {
         val m = number % 10
         number = number / 10
         val p = factorial(m).toInt
         sum += p
      }

      if (sum == i) {
        result += i
      }
    }

    println(result)
  }
}
