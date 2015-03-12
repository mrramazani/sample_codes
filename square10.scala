#!/bin/sh
exec scala -savecompiled "$0" "$@"
!#

for (i <- 1 to 11)
{
    for (j <- 1 to i)
      print("*")
    println("")
}
