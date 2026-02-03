# INTEFORM - Aplicação Frontend

Bem-vindo à aplicação frontend da **INTEFORM**! Esta é uma aplicação web desenvolvida em **Java** utilizando **Spring Boot** e **Thymeleaf**.

## 📋 Descrição

A aplicação consiste em um site com 3 páginas principais:

1. **Página Inicial** - Apresentação da empresa INTEFORM com texto descritivo
2. **Localização** - Endereço da empresa integrado com Google Maps
3. **Fale Conosco** - Informações de contato (telefone e e-mail)

## 🛠 Requisitos

- **Java 25+** (LTS)
- **Maven 3.9+** (para execução local)
- **Docker & Docker Compose** (para execução em container)

## 🚀 Como Executar

### Opção 1: Execução Local (Linha de Comando)

1. **Navegar até a pasta do projeto:**
```bash
cd inteform
```

2. **Compilar o projeto:**
```bash
mvn clean install
```

3. **Executar a aplicação:**
```bash
mvn spring-boot:run
```

4. **Acessar a aplicação:**
Abra seu navegador e acesse: `http://localhost:8080`

**Parar a aplicação:** Pressione `Ctrl + C` no terminal

---

### Opção 2: Execução com Docker Compose

1. **Navegar até a pasta do projeto:**
```bash
cd inteform
```

2. **Iniciar a aplicação:**
```bash
docker-compose up --build
```

A aplicação será iniciada e estará disponível em: `http://localhost:8080`

**Para parar a aplicação:**
```bash
docker-compose down
```

**Para executar em background:**
```bash
docker-compose up -d --build
```

**Para ver os logs:**
```bash
docker-compose logs -f inteform-frontend
```

---

## 📁 Estrutura do Projeto

```
inteform/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/inteform/
│   │   │       ├── InteformApplication.java
│   │   │       └── controller/
│   │   │           └── PageController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── style.css
│   │       └── templates/
│   │           ├── index.html
│   │           ├── location.html
│   │           └── contact.html
├── pom.xml
├── Dockerfile
├── docker-compose.yml
└── README.md
```

## 📝 Configuração

A aplicação está configurada para rodar na **porta 8080**. Você pode alterar isso no arquivo `src/main/resources/application.properties`:

```properties
server.port=8080
```

## 🌐 Integração Google Maps

A página de localização utiliza a **Google Maps API**. Para usar a integração completa com seu próprio mapa:

1. Acesse o [Google Cloud Console](https://console.cloud.google.com/)
2. Crie uma chave de API para Google Maps JavaScript API
3. Substitua a chave no arquivo `src/main/resources/templates/location.html`:

```html
<script src="https://maps.googleapis.com/maps/api/js?key=SUA_CHAVE_AQUI"></script>
```

## ✨ Tecnologias Utilizadas

- **Java 25** - Linguagem de programação
- **Spring Boot 3.2.0** - Framework web
- **Thymeleaf** - Template engine
- **Maven** - Gerenciador de dependências
- **Docker** - Containerização
- **Google Maps API** - Mapa interativo

## 🐛 Troubleshooting

### A porta 8080 já está em uso
Se a porta 8080 estiver ocupada, você pode alterar em `application.properties`:
```properties
server.port=8081
```

### Docker não encontrado
Certifique-se de que Docker e Docker Compose estão instalados:
```bash
docker --version
docker-compose --version
```

### Erro ao compilar com Maven
Limpe o cache e reinstale as dependências:
```bash
mvn clean install -U
```

## 📧 Suporte

Para suporte, entre em contato:
- **Telefone:** (11) 3676-1315
- **E-mail:** atendimento@interform.com.br

## 📄 Licença

© 2025 INTEFORM. Todos os direitos reservados.

---

**Versão da Aplicação:** 1.0.0  
**Última atualização:** Fevereiro de 2025
