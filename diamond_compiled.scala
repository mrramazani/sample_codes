object DiamondCompiledVersion
{
  def main(args: Array[String]) = {
    Console.print("Please enter semi-height of diamond as Int: ")
    val h = readInt()
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
