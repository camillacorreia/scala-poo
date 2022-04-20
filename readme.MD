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


