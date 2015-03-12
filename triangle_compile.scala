object TriangleCompiledVersion
{
  def main(args: Array[String]) = {
    Console.print("Please enter height of triangle as Int: ")
    val h = readInt()
    for (i <- 0 to h - 1)
    {
      for (j <- 1 to h - i - 1)
        print(" ")
        for (j <- 1 to 1 + 2 * i)
          print("*")
          println()
    }
  }
}
