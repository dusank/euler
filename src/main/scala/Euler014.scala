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

// 837799

object Euler014
{
  def collatzLength(l: Long) : Int = {
    var i = 1
    var n = l
    var nn = 0l

    while (nn != 1) {
      if (n % 2 == 0) {
        nn = n / 2
      } else {
        nn = 3 * n + 1
      }
      n = nn
      i += 1
    }
    i
  }

  def main(args: Array[String]) {
    var maxNo = 0
    var maxLen = 0

    for (i <- 1 to 1000000) {
      val cl = collatzLength(i)
      if (cl > maxLen) {
        maxNo = i
        maxLen = cl
        println(maxNo + " -> " + maxLen)
      }
    }
    println
    println(maxNo + " -> " + maxLen)
  }
}
