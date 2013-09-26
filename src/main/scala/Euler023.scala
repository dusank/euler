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

// 4179871

import Lib._

object Euler023
{
  def alphaVal(s: String) : Int = {
     var sum = 0

     for (i <- s) {
       sum += i - 'A' + 1
     }
     sum
  }

  def isAbundant(l: Long) : Boolean = {
    l < divisorSum(l)
  }

  def main(args: Array[String]) {
    val MAX = 28123
    var abundant : Set[Int] = scala.collection.immutable.TreeSet()

    for (i <- 1 to MAX) {
      if (isAbundant(i)) {
        abundant += i
      }
    }

    var sum = 0l

    for (i <- 1 to MAX) {
      var can = false
      for (n <- abundant) {
        if (abundant(i - n)) {
           can = true
        }
      }
      if (can != true) {
        sum += i
      }
    }

    println(sum)
  }
}
