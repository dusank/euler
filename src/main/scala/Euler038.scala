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

// 932718654

import Lib._

object Euler038
{
  def pandigitalMultiple(l : Long) : Option[Long] = {
     val m = Array(1, 2, 3, 4, 5, 6, 7) map (_ * l) map (_.toString)

     var n = 9
     var i = 0
     while (n > 0) {
       n -= m(i).length
       i += 1
     }

     if (n != 0) {
       return None
     }

     val s = m.mkString.take(9)
     val r = s.toLong

     if (isPandigital(r)) Some(r) else None
  }

  def main(args: Array[String]) {
    var max = 0l

    for (l <- 2l until 10000l) {
      pandigitalMultiple(l) match {
        case Some(x) =>
          if (max < x) {
            max = x
            print("max = ")
          }
          println(x)
        case None =>
      }
    }
  }
}
