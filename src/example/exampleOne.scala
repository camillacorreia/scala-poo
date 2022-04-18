package example

object exampleOne extends App {
  val autor = new Autor("João", "Correia", 1995)
  val livro = new Livro("Aventuras de João", 2022, autor)

  println(autor.nomeCompleto)
  println(livro.idadeAutor())
  livro.escritoPor()


  val maria = new Expectador("Maria", "Barbie")
  println(maria.gostaDoFilme("Lagoa Azul"))
  println(maria.gostaDoFilme("Barbie"))

  //infixNotation
  println(maria gostaDoFilme "Encantado")

  val joao = new Expectador("João", "Homem-Aranha")
  println(maria.saiuComFulano(joao))

  //infixNotation
  println(maria saiuComFulano joao)

  //apply
  println(maria())
}

class  Autor(nome: String, sobrenome: String, val anoNascimento: Int){
  def nomeCompleto: String = nome + " " + sobrenome
}

class Livro(nome: String, anoLancamento: Int, autor: Autor){
  def idadeAutor(): Int = anoLancamento - autor.anoNascimento
  def escritoPor(): Unit = println(s"O livro foi escrito por ${autor.nomeCompleto}")
}

class Expectador(val nome: String, filmeFavorito: String){
  def gostaDoFilme(filme: String): Boolean = filme == filmeFavorito
  def saiuComFulano(pessoa: Expectador): String = s"${this.nome} saiu com ${pessoa.nome}"
  def apply(): String = s"Ola meu nome é $nome"
}

