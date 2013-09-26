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

// 104743

import Lib._

object Euler007
{
  val C = 600851475143l

  def main(args: Array[String]) {
    computeSieve(104743)
    var i = 2l
    var p = 0

    while (true)  {
      if (isPrime(i)) {
        p += 1
        println(p + "\t" + i)

        if (p == 10001) {
          sys.exit(0)
        }
      }
      i += 1
    }
  }
}
