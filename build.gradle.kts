plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.yullin"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// lombok plugin
	implementation("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	testImplementation("org.projectlombok:lombok")
	testAnnotationProcessor("org.projectlombok:lombok")

	// Mybatis
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3")

	// Swagger
	implementation("io.springfox:springfox-boot-starter:3.0.0")
	implementation("io.springfox:springfox-swagger-ui:3.0.0")
	implementation ("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
	implementation("io.springfox:springfox-swagger2:3.0.0")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.8")

	// servlet
	implementation("javax.servlet:javax.servlet-api:4.0.1")


	// Mysql
	runtimeOnly("com.h2database:h2")
	runtimeOnly("mysql:mysql-connector-j")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

