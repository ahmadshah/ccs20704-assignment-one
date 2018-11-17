.PHONY: test build run-question-one run-question-two run-question-four run-question-five

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

run-question-five:
	mvn exec:java -Dexec.mainClass="msu.oop.assignment.jusco.Testing"