# 📊 Calculadora de IMC - CaixaDialogo

Projeto desenvolvido em **Java** utilizando a biblioteca **Swing (JOptionPane)** para criar caixas de diálogo interativas. O programa solicita o nome, o peso e a altura do usuário, calcula o Índice de Massa Corporal (IMC) e apresenta uma mensagem de acordo com o resultado.

## 🚀 Funcionalidades

- Solicita o nome do usuário.
- Recebe o peso em quilogramas (kg).
- Recebe a altura em metros (m).
- Calcula automaticamente o IMC.
- Apresenta uma mensagem de acordo com a faixa de IMC identificada.

## 🧮 Fórmula do IMC

O cálculo é realizado utilizando a seguinte fórmula:

```java
imc = peso / (altura * altura);
```

## 📋 Classificação utilizada no projeto

| IMC | Classificação |
|---|---|
| Abaixo de 18,5 | Abaixo do peso |
| 18,5 até 24,9 | Peso adequado |
| 25 até 29,9 | Sobrepeso |
| 30 ou mais | Obesidade |

*Observação: as classificações são simplificadas para fins didáticos e não substituem uma avaliação profissional de saúde.*

## 🛠️ Tecnologias utilizadas

- **Java** – Linguagem de programação.
- **Java Swing** – Biblioteca utilizada para criar as caixas de diálogo.
- **JOptionPane** – Componente responsável pela entrada e exibição de informações.

## ▶️ Como executar o projeto

1. Clone este repositório:

```bash
git clone URL_DO_SEU_REPOSITORIO
```

2. Abra o projeto em uma IDE compatível com Java, como NetBeans.
3. Localize a classe `CaixaDialogo.java`.
4. Execute o método `main`.

## 💻 Exemplo de utilização

O programa solicitará as seguintes informações:

- Nome: Samuel
- Peso: 70
- Altura: 1.75

Após realizar o cálculo, será exibida uma caixa de diálogo com a mensagem correspondente ao resultado do IMC.

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais da programação Java, como:

- Declaração de variáveis.
- Tipos de dados (`String` e `double`).
- Entrada e saída de dados.
- Conversão de String para números com `Double.parseDouble()`.
- Estruturas condicionais (`if`, `else if` e `else`).
- Operações matemáticas.
- Utilização de caixas de diálogo com `JOptionPane`.

---

**Desenvolvido para fins educacionais e de aprendizado em Java.** ☕
