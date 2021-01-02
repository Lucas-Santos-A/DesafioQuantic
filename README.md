# ✔ Indice 

- [Sobre](#-sobre)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Como Baixar o Projeto](#-como-baixar-o-projeto)
- [Detalhes](#-detalhes)

---

## 📜 Sobre 

Este programa consome os dados presentes no endereço (https://ics.multieditoras.com.br/ics/agenda/1/2017/12?chave=TFACS-PD6L7-WG5ZF-Q9WU9&cliente=10378405&compacto=0&formato=json), grava as informações no mongoDB e após exibe as informações persistidas no banco no console. Por fins de praticidade tudo isto acontece logo após a execução do programa, sem necessidade de chamar os endpoints do programa. 

---

## 🚀 Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as as seguintes tecnologias.

- Java 
- Spring Framework

---

## 📦 Como Baixar o Projeto

 Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

```bash
$ git clone https://github.com/Lucas-Santos-A/DesafioQuantic

$ cd DesafioQuantic

$ mvn spring-boot:run

#O projeto será executado e as informações irão aparecer no console.
```
---
## 🔍 Detalhes

Logo após a execução será automaticamente criado um banco de dados com o nome de desafioQuantic no mongoDB localhost. 

Caso precise colocar username e senha é possível descomentar as configurações no file application.properties.

Não é obrigatório executar a aplicação através do cmd, é possível usar IDEs como o IntelliJ. Mesmo assim é obrigatório o Maven estar instalado e adicionado no PATH do sistema operacional.







