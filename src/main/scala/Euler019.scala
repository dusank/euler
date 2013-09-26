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

// 171

import java.util._
import java.text._

object Euler019
{
  def main(args: Array[String]) {
    val fi = new SimpleDateFormat("yyyy-MM-dd")
    val fo = new SimpleDateFormat("E")

    var count = 0

    for (y <- 1901 to 2000) {
      for (m <- 1 to 12) {
        val t = fi.parse(y + "-" + m + "-01")

        if (fo.format(t) == "Mon") {
          count += 1
        }
      }
    }

    println(count)
  }
}
