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

// 2783915460

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.TreeSet
import scala.collection.SortedSet

object Euler024
{
  def addPermutations(s : String, col : ArrayBuffer[String], elems : SortedSet[Char], depth : Int) : ArrayBuffer[String] = {
    if (s.length == depth ) {
      col += s
      if (col.length == 1000000) {
        println(s)
        sys.exit(0)
      }
    } else {
      for (e <- elems) {
        addPermutations(s + e, col, elems - e, depth)
      }
    }
    col
  }

  def main(args: Array[String]) {
    val col = addPermutations("", ArrayBuffer(), TreeSet('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'), 10)
  }
}
