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

// 73682

object Euler031
{

  def main(args: Array[String]) {

    val target = 200
    var ways = 0

    for (a <- target to 0 by -200) {
      for (b <- a to 0 by -100) {
        for (c <- b to 0 by -50) {
          for (d <- c to 0 by -20) {
            for (e <- d to 0 by -10) {
              for (f <- e to 0 by -5) {
                for (g <- f to 0 by -2) {
                  ways += 1
                }
              }
            }
          }
        }
      }
    }
    println(ways)
  }
}
