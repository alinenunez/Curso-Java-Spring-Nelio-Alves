# Sistema de Cálculo de Pedidos - Spring Boot

Esta é uma aplicação de linha de comandos desenvolvida em Java com o framework Spring Boot. O objetivo do sistema é calcular o valor total de um pedido, aplicando regras de desconto e calculando dinamicamente os custos de envio (frete) com base no valor inicial da compra.

## ⚙️ Funcionalidades

A aplicação lê os dados inseridos pelo utilizador através da consola (código do pedido, valor básico e percentagem de desconto) e realiza o seguinte fluxo de operações:

* **Desconto:** Calcula a dedução percentual aplicada diretamente sobre o valor básico do pedido.
* **Portes de Envio (Frete):** Calcula o custo de envio de acordo com regras de negócio baseadas no valor da compra[cite: 3]:
  * Valores abaixo de 100.0: Aplica-se uma taxa de 20.0.
  * Valores entre 100.0 e 199.99: Aplica-se uma taxa de 12.0.
  * Valores iguais ou superiores a 200.0: O envio é gratuito (0.0).
* **Valor Total:** Subtrai o valor do desconto ao valor base e soma o custo do frete, imprimindo posteriormente o resultado final no ecrã utilizando um componente de *logger* (SLF4J).

## 🏗️ Estrutura do Projeto

O sistema está organizado utilizando a injeção de dependências do Spring e divide-se nas seguintes classes principais:

* `Order.java`: A entidade de modelo de dados que representa o pedido, armazenando o código, o valor base e a percentagem de desconto.
* `ShippingService.java`: Componente registado como `@Service`, com responsabilidade exclusiva sobre a lógica de cálculo do frete.
* `OrderService.java`: Componente (`@Service`) que injeta o `ShippingService` para orquestrar o cálculo final do valor total do pedido.
* `ServicoApplication.java`: A classe principal (`@SpringBootApplication`) que implementa a interface `CommandLineRunner` para executar o programa no terminal, ler os dados de entrada via `Scanner` utilizando o `Locale.US` e exibir o resultado formatado.

## 🚀 Como Executar

1. Importe a pasta do projeto para o IntelliJ IDEA Ultimate ou para o seu IDE de preferência.
2. Aguarde a sincronização das dependências do Spring Boot (Maven/Gradle).
3. Execute a classe principal `ServicoApplication.java`.
4. A consola irá solicitar a introdução dos dados sequencialmente:
   * Digite o codigo do pedido:
   * Digite o valor basico do pedido:
   * Digite o percentual de desconto:
5. O sistema processará os dados e devolverá o registo com o código do pedido e o valor total formatado com duas casas decimais.
