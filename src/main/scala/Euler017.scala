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

// 21124

object Euler017
{
  def int2string(i: Int) : String = {
    val sb = new StringBuffer

    val hundreds = i / 100
    val tens = (i / 10) % 10
    val ones = i % 10

    val twoDigit = i % 100

    if (i == 1000) {
       return "onethousand"
    }

    sb append (hundreds match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
      case _ => ""
    })

    if (hundreds > 0) {
      sb append "hundred"
    }

    if (twoDigit != 0 && hundreds != 0) {
      sb append "and"
    }

    sb append (tens match {
      case 1 => 
        ones match {
          case 0 => "ten"
          case 1 => "eleven"
          case 2 => "twelve"
          case 3 => "thirteen"
          case 4 => "fourteen"
          case 5 => "fifteen"
          case 6 => "sixteen"
          case 7 => "seventeen"
          case 8 => "eighteen"
          case 9 => "nineteen"
          case _ => ""
        }

      case 2 => "twenty"
      case 3 => "thirty"
      case 4 => "forty"
      case 5 => "fifty"
      case 6 => "sixty"
      case 7 => "seventy"
      case 8 => "eighty"
      case 9 => "ninety"
      case _ => ""
    })

    if (tens != 1) {
      sb append (ones match {
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        case 4 => "four"
        case 5 => "five"
        case 6 => "six"
        case 7 => "seven"
        case 8 => "eight"
        case 9 => "nine"
        case _ => ""
      })
    }

    sb.toString
  }

  def main(args: Array[String]) {
    var sum = 0

    for (i <- 1 to 1000) {
      val s = int2string(i)
      println(s)
      sum += s.length
    }

    println
    println(sum)
 
  }
}
