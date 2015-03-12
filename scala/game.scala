#!/bin/sh
exec scala -savecompiled "$0" "$@"
!#


import util.Random.nextInt

val num = nextInt(100)
//Stream.continually(nextInt(100)).take(10)
var win = false
var chances = 7 // Surely wins
println("Guess the number. Hads bezan.")
(0 to chances).toStream.takeWhile(_ => win != true).foreach(i =>
{
  val guess = readInt()
  if (guess > num)
    println("Smaller Kochik tare")
  else if (guess < num)
    println("Bigger bozorg tare")
  else if (guess == num)
  {
    win = true
    println("Doroste. Sad Afarin")
    val h = (chances - i) * 2
    for (i <- 0 to h)
    {
      for (j <- 1 to h - i)
        print(" ")
        for (j <- 1 to 1 + 2 * i)
          print("*")
          println()
    }

    for (i <- 0 to h - 1)
    {
      for (j <- 1 to i + 1)
        print(" ")
        for (j <- 1 to (h - i) * 2 - 1)
          print("*")
          println()
    }
  }
}
)

if (win == false)
{
  println("Looseeeeeeeeeeeeer! Bakhti")
  println("Javb " + num.toString + " bood")
}

