### PROGRAMAÇÃO ORIENTADA A OBJETO – SCALA

#### Overloading de Métodos

Quando tem duas funções ou dois métodos com o mesmo nome. Precisa ter o mesmo tipo de retorno.

#### Infix Notation
Esse tipo de sintaxe funciona apenas para um parâmetro.

````
Println(maria.gostaDoFilme("Barbie"))

//infixNotation
println(maria gostaDoFilme "Encantado")
````

#### Apply
Método que não tem parâmetro.

````
println(maria())
````

#### Classe
Regras(lógica), adjetivos(Atributos) e verbos(métodos). Parte escrita, o arquivo em seu projeto.

É a planta, é o planejamento, é o modelo a ser seguido para que a casa seja construída dentro de certas características. É algo abstrato, é algo lógico. Lá está definido todos os elementos que a casa terá e as características básicas de como eles serão compostas. Ela só existe no código. Classe tipifica o que será modelado por ela. Ela determina os estados possíveis e os comportamentos que os objetos podem ter.

````
Em Scala, uma classe cria várias instâncias.
````

#### Objeto
A pessoa em si (Instancia), João. Dados que estão na memória e foram carregados na execução.

É algo concreto, algo físico. Nele os elementos estão de fato presentes ali. É algo palpável (em termos de computador), é algo que pode ser manipulado. Ele existe na memória, durante a execução da aplicação. Objeto possui valores para os estados definidos e chamam os comportamentos definidos executando os algoritmos. Tem um tempo de vida transitório.

Não tem um construtor, não é possível passar parâmetros para um objeto.

Não precisamos da palavra new antes de uma instanciar um objeto. Quando você cria um object, ele vai ser instantaneamente instanciado.

````
Em Scala, um objeto sempre vai criar uma única instância, não importa quantas vezes você a instancia. E é por isso que o object é chamado um singleton.
````

#### Objetos com a Função main

Torna o objeto executável.

````
object Usuario extends App {
  println("Estou executando o objeto Usuario")
}
````

````
object Usuarios {
  def main(args: Array[String]): Unit = {
    println("Estou executando o objeto Usuario através do método main")
  }
}
````

#### Herança

Mecanismo pelo qual uma classe pode herdar os recursos (campos e métodos) de outra classe.

Uma das coisas que estimula o uso de herança de classes é o conceito de reusabilidade, permitindo que classes reusem atributos e métodos que estão disponíveis em outras classes, evitando duplicação de código.

````
object POOScala extends App {
  val gatinho = new Gato
  gatinho.comer
}
````

````
class Animal {
  def comer: Unit = println("Comida liberada)
}
````

````
class Gato extends Animal
````

#### Classes Abstratas

Uma classe abstrata é uma classe como qualquer outra mas escrita com um abstract na frente da declaração. Ela também pode ter um construtor e receber parâmetros (como qualquer classe) e ter métodos e atributos que podem ser sobrescritos.

````
abstract class Animal {
  val tipo: String
  def come: Unit
}
````

````
class Cachorro extends Animal {
  override val tipo: String = "Cachorro"
  override def come: Unit = ???
}
````

````
val animal = new Animal // Erro! class Animal is abstract; cannot be instantiated
val cachorro = new Cachorro // Works!
````

Pode colocar um parâmetro obrigatório na classe abstrata, adicionando um construtor dessa forma:

````
abstract class Animal(val identificacao: String)
class Cachorro(val nome: String) extends Animal(nome)
````

CONTUDO, só é possível estender 1 classe abstrata em uma classe regular. Portanto, na classe Cachorro não pode extender nenhuma outra classe além de Animal. Essa restrição da linguagem, de apenas permitir que uma classe herde de apenas uma outra classe, se chama herança única (single inheritance).