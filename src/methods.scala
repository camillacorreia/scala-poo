object methods extends App {
  val pessoa = new People("Camilla", 21)
  println(pessoa.idade)
  println(pessoa.x)
  pessoa.apresentacao("Marcos")
  pessoa.saudacoes()
}

class People(nome: String, val idade: Int) {
  val x = 5;
  println("Hello")

  def apresentacao(nome: String): Unit = println(s"Ola $nome, meu nome é ${this.nome}")

  def saudacoes(): Unit = println(s"Ola meu nome é $nome")
  //fica implícito
}
