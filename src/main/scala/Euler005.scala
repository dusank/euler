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

// 232792560

object Euler005
{
  def isDivisible(n: Long) : Boolean = {
    for (i <- 1 to 20) {
      if (n % i != 0) {
        return false
      }
    }
    return true
   }

  def main(args: Array[String]) {
    for (i <- 1 to Integer.MAX_VALUE) {
      if (isDivisible(i)) {
        println(i)
        sys.exit(0)
      }
    }
  }
}
