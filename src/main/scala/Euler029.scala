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

// 9183

object Euler029
{
  def main(args: Array[String]) {
    var sset : Set[BigInt] = scala.collection.immutable.TreeSet.empty[BigInt]

    for (a <- 2 to 100) {
      for (b <- 2 to 100) {
        val ba = BigInt(a)
        sset += ba.pow(b)
      }
    }

    println(sset.size)
  }
}
