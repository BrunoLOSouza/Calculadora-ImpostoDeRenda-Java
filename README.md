# 💰 Calculadora de Imposto de Renda (Java)

Este é um projeto simples em Java que calcula o valor do imposto de renda com base no salário informado pelo usuário, seguindo uma lógica progressiva de faixas de tributação.

## 🧮 Lógica de Cálculo

As alíquotas são aplicadas de forma progressiva:

- Até **R$ 2000,00** → **Isento**
- De **R$ 2000,01** até **R$ 3000,00** → **8% sobre o que excede R$ 2000,00**
- De **R$ 3000,01** até **R$ 4500,00** → **18% sobre o que excede R$ 3000,00 + 8% sobre os R$ 1000,00 anteriores**
- Acima de **R$ 4500,00** → **28% sobre o que excede R$ 4500,00 + 18% sobre R$ 1500,00 + 8% sobre R$ 1000,00**

## 📌 Exemplo de Uso

bash
Digite o valor do seu salario: 3500.00
valor do seu imposto de renda é: 80.00 R$

🚀 Como Executar

1-Clone este repositório:
git clone https://github.com/BrunoLOSouza/Calculadora-ImpostoDeRenda-Java.git

2-Compile o código:
javac Imposto.java

3-Execute o programa:
java Imposto

📁 Arquivo
Imposto.java: Código-fonte principal da calculadora.

🛠️ Requisitos
Java JDK instalado (versão 8 ou superior)

Terminal ou IDE compatível com Java

📄 Licença
Este projeto está sob a licença MIT.

Feito com 💻 por BrunoLOSouza

