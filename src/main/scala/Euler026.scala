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

// 983

object Euler026
{
  def main(args: Array[String]) {
    var sequenceLength = 0
    var num = 0

    for (i <- 999 to 2 by -1) {
      if (sequenceLength < i) {
        val foundRemainders = Seq.fill(i)(0).toArray
        var value = 1
        var position = 0

        while (foundRemainders(value) == 0 && value != 0) {
          foundRemainders(value) = position
          value *= 10
          value %= i
          position += 1
        }

        val dif = position - foundRemainders(value)

        if (dif > sequenceLength) {
          num = i
          sequenceLength = dif
        }
      }
    }

    println("Number = " + num + " (recurring cycle length = " + sequenceLength + ")")
  }
}
