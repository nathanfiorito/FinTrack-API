# Etapa 1: build com Maven
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Copia os arquivos do projeto
COPY pom.xml .
COPY src ./src

# Executa o build do projeto
RUN mvn clean package -DskipTests

# Etapa 2: imagem final com o JAR
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia o JAR da etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Define o comando padrão para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
