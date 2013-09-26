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

// 748317

import Lib._

object Euler037
{
  def isTruncatablePrime(l : Long) : Boolean = {
    var s = l.toString

    if (!isPrime(l)) return false

    for (i <- 1 until s.length) {
      s = s.tail
//      println(s)
      if (!isPrime(s.toLong)) return false
    }

    s = l.toString
    for (i <- 1 until s.length) {
      s = s.init
//      println(s)
      if (!isPrime(s.toLong)) return false
    }

    true
  }

  def main(args: Array[String]) {
    computeSieve(739397)

    var l = 11l
    var primes = 0
    var sum = 0l

    while (primes < 11) {
      if (isTruncatablePrime(l)) {
        sum += l
        primes += 1
        println(l)
      }
      l += 1
    }
    println
    println(sum)
  }
}
