JAVAC = javac
JAVA = java
MAIN = TestMain

SOURCES = \
	TestMain.java \
	Groceries/GroceryFactory.java \
	Groceries/CreateGrocery.java \
	Groceries/GroceryIf.java \
	Groceries/Apple.java \
	Groceries/Orange.java \
	Tools/ToolFactory.java \
	Tools/CreateTool.java \
	Tools/ToolIf.java \
	Tools/Hammer.java \
	Tools/Screwdriver.java

CLASSES = $(SOURCES:.java=.class)

all: $(CLASSES)

# compiles .java files to .class 
%.class: %.java
	$(JAVAC) $<

clean:
	rm -f *.class factories/*.class Groceries/*.class Tools/*.class

run: all
	$(JAVA) $(MAIN)