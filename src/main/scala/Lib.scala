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

object Lib
{
  val sieve = scala.collection.mutable.BitSet.empty
  var sieveMax = 0

  def computeSieve(n: Int) {
    sieveMax = n

    for (i <- 2 to n) {
      sieve += i
    }

    for (i <- 2 to n / 2) {
      for (j <- (i * 2) to n by i) {
        sieve -= j
      }
    }
  }

  def isPrime(l: Long) : Boolean = {
    if (l == 1) {
      return false
    }

    if (l <= sieveMax) {
      return sieve(l.toInt)
    }

    var i = 2l

    while (i <= l / 2)  {
      if (l % i == 0) {
//        println(l + " divisible by " + i)
        return false
      }
      i += 1
    }
    return true;
  }

  def isPalindrome(s: String) : Boolean = {
    val hl = s.length / 2

    if (s.length % 2 == 0) {
      s.take(hl) == s.drop(hl).reverse
    } else {
      s.take(hl) == s.drop(hl + 1).reverse
      }
   }

  def isPandigital(num: Long) : Boolean = {
    var n = num
    var digits = 0
    var count = 0
    var tmp = 0

    while (n > 0) {
        tmp = digits
        digits = digits | 1 << ((n % 10) - 1);
        if (tmp == digits) {
            return false
        }

        count += 1
        n = n / 10
    }

    digits == (1 << count) - 1;
  }

  def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x - 1)

  def fib(a: Long, b: Long): Stream[Long] = a #:: fib(b, a + b)

  def fibBig(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibBig(b, a + b)

  def divisorSum(l: Long) : Long = {
    var i = 1l
    var sum = 0l

    while (i <= Math.sqrt(l))  {
      if (l % i == 0) {
        if (l == i * i) {
	  sum += i
        } else {
          sum += i
          if (i != 1) {
            sum += l / i
          }
        }
      }
      i += 1
    }
    return sum;
  }
}
