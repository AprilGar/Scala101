val names:Seq[String] = Seq("Loki", "Moose", "Maple", "Mango", "Pitta", "Winnie")

val exampleMap: Map[Int, String] = Map (1 -> "Loki", 2 -> "Moose", 3 -> "Maple", 4 -> "Mango", 5 -> "Pitta", 6 -> "Winnie")
val pet = exampleMap(1)

val numbers:Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10)
val addOneSeq = numbers.map {number => number+1}
val oddNumbersOnly = numbers.filter{
  number => number % 2 !=0
}

//contain a particular letter within a string
val containsLetterT = names.exists(name => name.contains('t'))
val containsLetterB = names.exists(name => name.contains('b'))