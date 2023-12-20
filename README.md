<h1 text-align: center>Projeto 01 - Conta Bancária - Iniciando o Projeto Java</h1>

Projeto Conta Bancária foi o Projeto Guia no Bootcamp Generation para o aprendizado dos Conceitos e aplicação da Orientação a Objetos. Todo o código que implementamos no projeto Conta Bancária serviu de base para a construção do Projeto Java, que marca o final do primeiro modulo. Veja o Diagrama de Classes do Projeto Conta Bancária completo na figura abaixo:

```mermaid
classDiagram
class Conta {
<<Abstract>>
  - numero : int
  - agencia : int
  - tipo : int
  - titular : String
  - saldo : float
  + int getNumero()
  + int getAgencia()
  + int getTipo()
  + String getTitular()
  + float getSaldo()
  + void setNumero(int numero)
  + void setAgencia(int agencia)
  + void setTipo(int tipo)
  + void setTitular(String titular)
  + void setSaldo(float saldo)
  + boolean sacar(float valor)
  + void depositar(float valor)
  + void visualizar()
}
class ContaCorrente {
  - limite : float
  + float getLimite()
  + void setLimite(float limite)
  + boolean sacar(float valor)
  + void visualizar()
}
class ContaPoupanca {
  - aniversario : int
  + int getAniversario()
  + void setAniversario(int aniversario)
  + void visualizar()
}
class ContaRepository{
<< Interface >>
+ void procurarPorNumero(int numero)
+ void listarTodas()
+ void cadastrar(Conta conta)
+ void atualizar(Conta conta)
+ void deletar(int numero)
+ void sacar(int numero, float valor)
+ void depositar(int numero, float valor)
+ void transferir(int numeroOrigem, int numeroDestino, float valor)
}
class ContaController{
+ void procurarPorNumero(int numero)
+ void listarTodas()
+ void cadastrar(Conta conta)
+ void atualizar(Conta conta)
+ void deletar(int numero)
+ void sacar(int numero, float valor)
+ void depositar(int numero, float valor)
+ void transferir(int numeroOrigem, int numeroDestino, float valor)
+ int gerarNumero()
+ Conta buscarNaCollection(int numero)
}
Conta <|-- ContaCorrente
Conta <|-- ContaPoupanca
Conta <.. ContaRepository
ContaRepository <|.. ContaController
```
