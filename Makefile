.PHONY: test build run

test:
	mvn test

build:
	mvn compile

length=0
width=0
run:
	mvn exec:java -Dexec.mainClass="msu.oop.assignment.Room" -Dexec.args="$(length) $(width)"