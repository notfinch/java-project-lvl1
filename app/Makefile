run:
	java -jar ./target/app-1.0-SNAPSHOT-jar-with-dependencies.jar

build:
	./app/mvnw checkstyle:check
	./app/mvnw clean package

update:
	./app/mvnw versions:display-dependency-updates
	./app/mvnw versions:display-plugin-updates
	./app/mvnw versions:display-property-updates
	./app/mvnw versions:update-properties

make lint:
	./app/mvnw checkstyle:check