Step 1: Create an interface - Shape.java
package net.javaguides.corejava.factorypattern;

public interface Shape {
 void draw();
}


Step 2: Create concrete classes implementing the same interface - Rectangle, Square, and Circle.
package net.javaguides.corejava.factorypattern;

public class Rectangle implements Shape {
 @Override
 public void draw() {
  System.out.println("Inside Rectangle::draw() method.");
 }
}
Square.java
package net.javaguides.corejava.factorypattern;

public class Square implements Shape {
 @Override
 public void draw() {
  System.out.println("Inside Square::draw() method.");
 }
}
Circle.java
package net.javaguides.corejava.factorypattern;

public class Circle implements Shape {
 @Override
 public void draw() {
  System.out.println("Inside Circle::draw() method.");
 }
}


Step 3: Create a ShapeType enum with predefined shapes like CIRCLE, RECTANGLE, and SQUARE.
package net.javaguides.corejava.factorypattern;

public enum ShapeType {
 CIRCLE, RECTANGLE, SQUARE;
}


Step 4: Create a Factory to generate an object of concrete class based on given information -ShapeFactory.java
package net.javaguides.corejava.factorypattern;

public class ShapeFactory {

 // use getShape method to get object of type shape
 public Shape getShape(ShapeType shapeType) {
  if (shapeType == null) {
   return null;
  }
  if (shapeType.equals(ShapeType.CIRCLE)) {
   return new Circle();

  } else if (shapeType.equals(ShapeType.RECTANGLE)) {
   return new Rectangle();

  } else if (shapeType.equals(ShapeType.SQUARE)) {
   return new Square();
  }

  return null;
 }
}


Step 5: Use the Factory to get an object of concrete class by passing an information such as type - FactoryPatternDemo.java
package net.javaguides.corejava.factorypattern;

public class FactoryPatternDemo {

 public static void main(String[] args) {
  ShapeFactory shapeFactory = new ShapeFactory();

  // get an object of Circle and call its draw method.
  Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

  // call draw method of Circle
  shape1.draw();

  // get an object of Rectangle and call its draw method.
  Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

  // call draw method of Rectangle
  shape2.draw();

  // get an object of Square and call its draw method.
  Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

  // call draw method of square
  shape3.draw();
 }
}
Output:
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
