// Create a file of randomly generated words of given length.  case insensitive

import util.Random.nextInt
import java.io._
import scala.annotation.tailrec

object WordGeneratorCompiledVersion
{
  val alphabet_list: List[Char]  = ('a' to 'z').toList

  def create_a_word(len: Int): List[Char] =
  {
    @tailrec
    def loop(word: List[Char]): List[Char] =
    {
      if(word.length == len) word
      else loop(alphabet_list(nextInt(26)) :: word)
    }
    loop(Nil)
  }

  def create_words(count: Int, max_len: Int, min_len: Int): List[List[Char]] =
  {
    @tailrec
    def loop(words: List[List[Char]]): List[List[Char]] =
    {
      if (words.length == count) words
      else loop(create_a_word(nextInt(max_len - min_len) + min_len) :: words)
    }
    loop(Nil)
  }

  def create_sentence(word_count: Int): String =
  {
    @tailrec
    def loop(sentence: String, count: Int): String =
    {
      if (count == word_count) sentence + "."
      else if (count == 0) loop(create_a_word(3 + nextInt(5)).mkString, 1)
      else loop(sentence + " " + create_a_word(3 + nextInt(5)).mkString, count + 1)
    }
    loop("", 0)
  }

  def main(args: Array[String]) =
  {
    val pw = new PrintWriter(new File("sentences.txt"))
    for (i <- 1 to 6000)
      pw.write(create_sentence(5 + nextInt(5)) + "\n")
    pw.close
  }
}
