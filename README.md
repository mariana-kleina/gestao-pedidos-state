# Gestão de Pedidos — Padrão State

Projeto em Java que demonstra a utilização do padrão de projeto **State** para gerenciar os diferentes estados de um pedido: *Novo*, *Pago*, *Enviado*, *Entregue*, *Cancelado*.

---

## 🎯 Visão Geral

Este projeto tem como objetivo auxiliar no entendimento e aplicação do padrão de design **State**, permitindo que um objeto altere seu comportamento quando o seu estado interno muda. No contexto, temos um sistema de pedidos, onde cada pedido (`Order`) pode estar em um dos vários estados, e cada estado define seu comportamento para ações como pagar, enviar, entregar ou cancelar.

---

## 🧩 Funcionalidades

- Modelagem de um objeto `Order` que mantém uma referência para um estado interno.
- Interface de estado `OrderState` e classes de estado concretas: `NovoState`, `PagoState`, `EnviadoState`, `EntregueState`, `CanceladoState`.
- Cada estado define o que acontece (ou não) quando são invocadas operações como `pagar()`, `enviar()`, `entregar()` ou `cancelar()`.
- Transições válidas de estado – por exemplo, só é possível enviar um pedido que já está pago; não é possível pagar um pedido que já está cancelado.
- Demonstração de encadeamento de estados e mudança de comportamento do objeto `Order` conforme seu estado muda.

---

## 🚀 Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/mariana-kleina/gestao-pedidos-state.git](https://github.com/mariana-kleina/gestao-pedidos-state.git)
    ```
2.  Acesse o diretório do projeto:
    ```bash
    cd gestao-pedidos-state
    ```
3.  Acesse o diretório `src` e compile o projeto:
    ```bash
    cd src
    javac pedido/*.java
    ```
4.  Execute a classe `Main` (ainda de dentro da pasta `src`):
    ```bash
    java pedido.Main
    ```
