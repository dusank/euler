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

// 31875000

object Euler009
{
  def main(args: Array[String]) {

    for (c <- 0 to 1000) {
      for (b <- 0 until c) {
        for (a <- 0 until b) {
          val abc = a + b + c

          if (abc == 1000 && a * a + b * b == c * c) {
            println("a=" + a)
            println("b=" + b)
            println("c=" + c)
            println("a+b+c=" + abc)
            println("a*b*c=" + (a * b * c))
          }
        }
      }
    }
  }
}
