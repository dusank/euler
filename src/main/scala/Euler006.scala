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

// 25164150

import scala.language.postfixOps

object Euler006
{
  def main(args: Array[String]) {
    val sumOfSquares = (1 to 100) map (x => x * x) sum
    val sum = (1 to 100) sum
    val squareOfSum = sum * sum

    println(squareOfSum - sumOfSquares)
  }
}
