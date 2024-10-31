
# Desafio Accenture

## Descrição

Este projeto é uma automação de testes para um site de seguros utilizando Cucumber e Selenium WebDriver. O objetivo principal é garantir que o processo de preenchimento e envio do formulário de aplicação de seguros funcione corretamente. A automação permite verificar se todos os campos são preenchidos corretamente e se a mensagem final de sucesso é exibida conforme esperado.

## Funcionalidades

- Preenchimento automatizado do formulário de aplicação de seguros.
- Validação de mensagens de sucesso após a submissão do formulário.
- Estrutura modular utilizando o padrão Page Object Model (POM) para facilitar a manutenção e escalabilidade.
- Integração com Cucumber para a descrição dos testes em formato Gherkin.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver os testes.
- **Selenium WebDriver**: Ferramenta para automação de navegadores web.
- **Cucumber**: Framework que permite escrever testes em linguagem natural (Gherkin).
- **JUnit**: Framework para testes unitários em Java.

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte maneira:

```
/InsuranceApplicationAutomation
│
├── /src
│   ├── /main
│   │   └── /java
│   │       └── pages
│   │           ├── EnterVehicleDataPage.java
│   │           ├── EnterInsurantDataPage.java
│   │           ├── EnterProductDataPage.java
│   │           ├── SelectPriceOptionPage.java
│   │           └── SendQuotePage.java
│   │ 
│   │       └── resources
│   │           ├── features
│   └── /test
│       └── /java
│           └── steps
│               └── TestSteps.java
│
└── InsuranceApplication.feature
```

- **`/pages`**: Contém as classes de página que representam cada etapa do formulário de aplicação de seguros.
- **`/steps`**: Contém a classe `TestSteps` que define os passos de teste e a lógica de automação.
- **`/features`**: Contém o arquivo Gherkin que descreve o cenários de teste.

## Pré-requisitos

Para executar este projeto, é necessário:

- **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE) para Java.
- **JDK 8 ou superior**: Certifique-se de que o JDK esteja instalado e configurado corretamente.
- **Maven**: O projeto utiliza Maven para gerenciar dependências.
- Um navegador suportado (ex. Chrome) e o respectivo WebDriver (ex. ChromeDriver).

## Configuração do Ambiente

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/michelesm/DesafioAccenture.git
   cd DesafioAccenture
   ```

2. **Abra o projeto no IntelliJ IDEA**:
    - Inicie o IntelliJ IDEA e selecione **Open**.
    - Navegue até a pasta do projeto e selecione-a.

3. **Instale as dependências**:
   As dependências do projeto estão definidas no arquivo `pom.xml`. O IntelliJ irá baixar as dependências automaticamente, mas você pode forçar a atualização através do Maven:
    - Vá até a aba **Maven** na barra lateral.
    - Clique com o botão direito em seu projeto e selecione **Reimport**.

4. **Baixe o WebDriver**:
   Baixe o WebDriver correspondente ao seu navegador e adicione o executável ao seu PATH. Para Chrome, você pode baixar o [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/).

## Execução dos Testes

Para executar os testes, você pode usar o Maven no terminal ou diretamente no IntelliJ:

### Usando o Terminal:

```bash
mvn test
```

### Usando o IntelliJ IDEA:

1. Clique com o botão direito na classe `TestSteps` ou no arquivo de feature.
2. Selecione **Run 'TestSteps'** ou **Run 'InsuranceApplication.feature'**.

Os testes irão rodar no navegador configurado e o resultado será exibido no console do IntelliJ.

## Estrutura Gherkin

Os testes estão escritos em arquivos `.feature` usando a linguagem Gherkin. 

```gherkin
Feature: Define a funcionalidade de alto nível que está sendo testada. No caso, Insurance Application representa a funcionalidade de aplicação de seguro, englobando todos os cenários relevantes para essa funcionalidade.
Scenario: Dentro de Feature, cada cenário representa uma situação ou fluxo específico de uso. Em nosso caso, o cenário Fill and Submit Insurance Application descreve o preenchimento e submissão do formulário.
Given: Indica a configuração inicial ou o estado de pré-condição para o teste. Aqui, I am on the insurance application page inicializa o estado do teste, que é estar na página inicial do aplicativo de seguro.
When: Descreve ações ou eventos que ocorrem no teste, como preencher dados e avançar para a próxima etapa. Em nosso cenário, esses passos são divididos para cada página de formulário, desde o preenchimento dos dados do veículo até a submissão dos detalhes de cotação.
Then: Define a validação ou o resultado esperado após as ações. O passo Then I should see the message "Sending e-mail success!" verifica o resultado esperado, ou seja, a exibição da mensagem de sucesso.

```

## Autora

Este projeto foi desenvolvido por:

- **Michele Santos** - [GitHub](https://github.com/michelesm)

## Contato

Para mais informações, entre em contato:

- Nome: Michele Santos
- E-mail: michele.memoria@maisunifacisa.com.br
