
# Insurance Application Automation

## Descrição

Este projeto é uma automação de testes para um aplicativo de seguros utilizando Cucumber e Selenium WebDriver. O objetivo principal é garantir que o processo de preenchimento e envio do formulário de aplicação de seguros funcione corretamente. A automação permite verificar se todos os campos são preenchidos corretamente e se as mensagens de sucesso são exibidas conforme esperado.

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
│   └── /test
│       └── /java
│           └── steps
│               └── TestSteps.java
│
└── /resources
└── features
└── InsuranceApplication.feature
```

- **`/pages`**: Contém as classes de página que representam cada etapa do formulário de aplicação de seguros.
- **`/steps`**: Contém a classe `TestSteps` que define os passos de teste e a lógica de automação.
- **`/features`**: Contém os arquivos Gherkin que descrevem os cenários de teste.

## Pré-requisitos

Para executar este projeto, você precisará de:

- **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE) para Java.
- **JDK 8 ou superior**: Certifique-se de que o JDK esteja instalado e configurado corretamente.
- **Maven**: O projeto utiliza Maven para gerenciar dependências.
- Um navegador suportado (ex. Chrome) e o respectivo WebDriver (ex. ChromeDriver).

## Configuração do Ambiente

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/InsuranceApplicationAutomation.git
   cd InsuranceApplicationAutomation
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

Os testes estão escritos em arquivos `.feature` usando a linguagem Gherkin. Um exemplo do cenário de teste é:

```gherkin
Feature: Insurance Application

  Scenario: Fill and Submit Insurance Application
    Given I am on the insurance application page
    When I fill in the vehicle data and proceed
    And I fill in the insurant data and proceed
    And I fill in the product data and proceed
    And I select a price option and proceed
    And I fill in the quote details and submit
    Then I should see the message "Sending e-mail success!"
```

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir com este projeto, siga os seguintes passos:

1. Faça um fork do repositório.
2. Crie uma nova branch (`git checkout -b feature/nome-da-sua-feature`).
3. Faça suas alterações e comite (`git commit -m 'Adicionando uma nova feature'`).
4. Envie sua branch (`git push origin feature/nome-da-sua-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Autoria

Este projeto foi desenvolvido por:

- **Seu Nome** - [Seu GitHub](https://github.com/seu-usuario)
- **Colaboradores**: [Nome de colaboradores, se houver]

## Contato

Para mais informações, entre em contato:

- Nome: Seu Nome
- E-mail: seuemail@exemplo.com
