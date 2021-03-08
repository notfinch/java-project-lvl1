run:
	java -jar ./target/app-1.0-SNAPSHOT-jar-with-dependencies.jar

build:
	./mvnw checkstyle:check
	./mvnw clean package

update:
	./mvnw versions:display-dependency-updates
	./mvnw versions:display-plugin-updates
	./mvnw versions:display-property-updates
	./mvnw versions:update-properties

make lint:
	./mvnw checkstyle:check