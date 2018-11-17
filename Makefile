.PHONY: test build run

test:
	mvn test

build:
	mvn compile

length=0
width=0
run-question-one:
	mvn exec:java -Dexec.mainClass="msu.oop.assignment.Room" -Dexec.args="$(length) $(width)"

run-question-two:
	mvn exec:java -Dexec.mainClass="msu.oop.assignment.Number"

run-question-four:
	mvn exec:java -Dexec.mainClass="msu.oop.assignment.rectangle.Test"