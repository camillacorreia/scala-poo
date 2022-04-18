package example

object exampleOne extends App {
  val autor = new Autor("João", "Correia", 1995)
  val livro = new Livro("Aventuras de João", 2022, autor)

  println(autor.nomeCompleto)
  println(livro.idadeAutor())
  livro.escritoPor()
}

class  Autor(nome: String, sobrenome: String, val anoNascimento: Int){
  def nomeCompleto: String = nome + " " + sobrenome
}

class Livro(nome: String, anoLancamento: Int, autor: Autor){
  def idadeAutor(): Int = anoLancamento - autor.anoNascimento
  def escritoPor(): Unit = println(s"O livro foi escrito por ${autor.nomeCompleto}")
}

