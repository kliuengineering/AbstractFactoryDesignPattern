JAVAC = javac
Java = java
MAIN_CLASS = Toolbox
CLASS_FILES = $(MAIN_CLASS).class

all: compile run

# let's depend on Toolbox.java
compile: $(MAIN_CLASS).java
	$(JAVAC) $(MAIN_CLASS).java

run:
	$(JAVA) $(MAIN_CLASS)

clean:
	rm -f *.class