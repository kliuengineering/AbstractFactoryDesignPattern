JAVAC = javac
JAVA = java
MAIN = ShoppingCart

SOURCES = ShoppingCart.java Groceries/GroceryBag.java Groceries/GroceryIf.java Tools/Toolbox.java Tools/ToolIf.java

CLASSES = $(SOURCES:.java=.class)

all: $(CLASSES)

# compiles .java files to .class 
%.class: %.java
	$(JAVAC) $<

clean:
	rm -f *.class Groceries/*.class Tools/*.class

run: all
	$(JAVA) $(MAIN)