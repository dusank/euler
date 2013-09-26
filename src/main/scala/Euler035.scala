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

// 55

import Lib._

object Euler035
{
  def main(args: Array[String]) {
    computeSieve(1000000)
    var count = 0

    for (i <- 2 until 1000000) {
      val s = i.toString
      val l = s.length

      var rot = s
      var isP = true

      for (j <- 0 until l) {
        rot = rot.tail + rot.head
        if(!isPrime(rot.toInt)) {
          isP = false
        }
      }

      if(isP == true) {
        println(s)
        count += 1
      }
    }
    println("Circular primes below 1000000: " + count)
  }
}
