object firstClass extends App {
  val pessoa = new Pessoa("Camilla", 21)
  println(pessoa.idade)
}

class Pessoa(nome: String, val idade: Int)
