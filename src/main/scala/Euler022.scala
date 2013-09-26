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

// 871198282

import java.io._
import scala.collection.immutable.TreeSet

object Euler022
{
  def alphaVal(s: String) : Int = {
     var sum = 0

     for (i <- s) {
       sum += i - 'A' + 1
     }
     sum
  }

  def main(args: Array[String]) {
//  val in = new BufferedReader(new FileReader("src/main/resources/Euler022.txt"))
//  var set = TreeSet.empty[String]

    val in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("Euler022.txt")))
    val ordering = Ordering.fromLessThan[String](_ < _)
    var set = new TreeSet[String]()(ordering)

    var line = ""

    do {
      line = in.readLine()

      if (line != null) {
        set += line
      }
    } while (line != null)

    var i = 1
    var sum = 0l

    for (e <- set) {
      sum += alphaVal(e) * i
      i += 1
    }

    println(sum)
  }
}
