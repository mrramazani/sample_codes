#!/bin/sh
exec scala -savecompiled "$0" "$@"
!#

// Create a file of randomly generated words of given length.
// case insensitive

import util.Random.nextInt

val min_len = 3;
val max_len = 8;

def generate_alphabet(): List[Char] = 
{
  def loop(a: List[Char]): List[Char] =
  {
    if (a.head == 'z') a
    else loop((a.head + 1).toChar :: a)
  }
  loop('a' :: Nil)
}

val alphabet_list = generate_alphabet()

def create_a_word(len: Int): List[Char] =
{
  //another way:
  //Stream.continually(nextInt(100)).take(10).toList
  def loop(word: List[Char]): List[Char] =
  {
    if(word.length == len) word
    else loop(alphabet_list(nextInt(26)) :: word)
  }
  loop(Nil)
}

def create_words(count: Int, max_len: Int, min_len: Int): List[List[Char]] = {
  def loop(words: List[List[Char]]): List[List[Char]] =
  {
    if (words.length == count) words
    else loop(create_a_word(nextInt(max_len - min_len) + min_len) :: words)
  }
  loop(Nil)
}

val words = create_words(80000, 10, 3)
words.foreach(x => println(x.mkString))


