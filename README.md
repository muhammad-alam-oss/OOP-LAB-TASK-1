OOP-LAB-TASK-1

Shapes (Java)

A small Java console program I made to practice method overloading together with inheritance. The Shape class has three methods all named area(), and each one takes different parameters. A Rectangle class extends Shape and overrides one of them.

How it's set up

Shape is the parent class. It has three versions of area():

area() with no parameters just prints "Area of Shape"
area(int side) treats the input as a square and prints side × side
area(int length, int width) treats the input as a rectangle and prints length × width

This is method overloading: same name, different parameter lists. Java picks the right one at compile time based on how many arguments you pass.

Rectangle extends Shape and overrides only the no-argument area() to print "Area of Rectangle". The other two versions are inherited as they are.

shapes is the main class. It makes a Shape object and calls area(9) and area(10, 6). Then it makes a Rectangle object and calls area(5) and area(5, 10).

What it prints

Area of square:
Area of Square = 81
Area of Rectangle = 60
Area of Rectangle:
Area of Square = 25
Area of Rectangle = 50
