val studentGrade: Int = 79

if (studentGrade >= 90) {
  println("A! Well done!")
} else if (studentGrade >=80){
  println("B")
}else if (studentGrade >=70){
  println("C")
}else if (studentGrade >=60){
  println("D")
}else if (studentGrade >=50){
  println("F")
} else {
  println("F, too bad")
}

val givenAge: Int = 33

if (givenAge >= 18){
  println("Films ratings: U, PG, 12A, 15 or 18")
} else if (givenAge >= 15){
  println("Films ratings: U, PG, 12A or 15")
} else if (givenAge >= 12){
  println("Films ratings: U, PG or 12A")
} else if (givenAge >= 8){
  println("Films ratings: U or PG")
}  else if (givenAge >= 4){
  println("Films ratings: U only")
} else {
  println("Too young to attend the cinema")
}

// List
val filmRating: List[String] = List("U", "PG", "12A", "15", "18")
println(filmRating.head)
println(filmRating.tail)
println(filmRating.reverse)
println(filmRating.isEmpty)

val bestPets = List.fill(3)("Dog!")
println(bestPets)
