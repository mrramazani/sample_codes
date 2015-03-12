#!/bin/sh
exec scala -savecompiled "$0" "$@"
!#


Console.print("Please enter length of rectangle: ")
val len = readInt()
print("Please enter width of rectangle: ")
val wid = readInt()
for (i <- 1 to len)
{
  for (j <- 1 to wid)
    print("*")
  println("")
}

