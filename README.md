# Atividade Faculdade — Listas de Exercícios em Java

## Requisitos

- **Java JDK 17 ou superior** instalado
  - Download: https://www.azul.com/downloads/#zulu 
  > eu baixei pelo zulu, mas se a senhora ja tiver o java, vai ser ótimo
- Verificar instalação: `java -version` e `javac -version` no terminal

<details>
  <summary>📂 <strong>Ver estrutura de pastas</strong></summary>

  * 📁 **listas_de_exercicios/**
    * 📁 `lista1/` — Exercícios de entrada e saída de dados
    * 📁 `lista2/` — Exercícios com estrutura condicional (`if`/`else`)
    * 📁 `lista3/` — Exercícios com condicionais encadeadas
    * 📁 `lista4/` — Exercícios com estrutura de escolha (`switch`/`case`)
    * 📁 `lista5/` — Exercícios com estrutura de repetição (`for`)
      * Nível 1 (questao1–8): estrutura básica do `for`
      * Nível 2 (questao9–15): entrada do usuário com `for`
      * Nível 3 (questao16–20): acumuladores
      * Nível 4 (questao21–25): contadores e lógica
    * 📁 `lista6/` — Exercícios com estrutura de repetição (`do-while`)
      * Controle de repetição com validação de dados
      * Menus interativos
      * Acumuladores e decisões condicionais
    * 📁 `lista7/` — Exercícios com vetores
      * Declaração e preenchimento manual e aleatório
      * Acesso a elementos por posição
      * Iteração, filtragem e inversão de vetores
    * 📁 `lista8/` — Exercícios com operadores lógicos (`&&`, `||`, `!`)
      * 15 questões com cenários do cotidiano
      * `Testes.java` — simula todas as combinações de entrada de cada questão

</details>

-Nessa nova entrega, peço que considere para a correção apenas os exercícios da lista7( é a que vale ponto hahaha )

Cada lista contém arquivos `questao1.java` até `questao20.java`, exceto a `lista5/` que vai até `questao25.java`. A `lista6/` e `lista7/` vão até `questao20.java` e `questao10.java` respectivamente. A `lista8/` vai até `questao15.java`.

## Como Executar

Os arquivos usam `package`, então os comandos devem ser executados a partir da **raiz do projeto** (`atividade-faculdade/`).

**Executar:**
```bash
java listas_de_exercicios.lista7.questao1
```

> se estiver usando o `IntelliJ IDEA` ou `VsCode` o botão para startar a aplicação vai está em algum lugar no canto da tela.
> Substitua `lista7` e `questao1` pela lista e questão desejada.
> Lembrando que as atividades importantes estão na lista7, as outras questões são das outras listas que a senhora passou.

**Executar os testes da lista8:**
```bash
java listas_de_exercicios.lista8.Testes
```

## Observações
- Os programas utilizam `Scanner` para leitura de dados via teclado — basta digitar os valores quando solicitado no terminal.
- Cada questão é independente e pode ser compilada e executada separadamente.
- Recomendado usar uma IDE como **VS Code** (com extensão Java) ou **IntelliJ IDEA** para facilitar a execução.
