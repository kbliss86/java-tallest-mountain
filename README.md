# Tallest Mountain Lab Exercise

## Overview
This lab exercise aims to practice Object-Oriented Programming (OOP) principles, interface implementation, and algorithmic problem-solving using Java. The task is to create an interface named `Formation` and two classes (`Mountain` and `Mesa`) that implement that interface. These classes will represent different types of geological formations. You will create instances of these classes, add them to a list, and determine the tallest formation. 

## Requirements

### Formation Interface
1. Create an interface called `Formation` that includes the following methods:
   - `int getHeight()`: Returns the height of the formation.
   - `String getInfo()`: Returns information about the formation, including the type (`Mountain` or `Mesa`), the surface area (if it's a `Mesa`), the name, and the height.

### Classes Implementing `Formation`

2. Create two classes that implement the `Formation` interface:
   - `Mountain`: 
     - Include private fields for `height` and `name`.
     - Include public getters, setters, and at least one constructor.
   - `Mesa`: 
     - Include private fields for `height`, `name`, and `area`.
     - Include public getters, setters, and at least one constructor.

### ArrayList of Formations

3. Create an `ArrayList` to hold instances of `Mountain` and `Mesa`.

### Methods in `App` Class

4. Create a static method `showInfo` in the `App` class:
   - Takes a list of `Formation` objects as a parameter.
   - Loops through the list and prints information about each formation.

5. Create a static method `findTallest` in the `App` class:
   - Takes a list of `Formation` objects as a parameter.
   - Loops through the list to determine the tallest formation and returns the tallest instance.

### Main Method

6. From the `main` method:
   - Call `showInfo` to print the information about all formations.
   - Call `findTallest` to determine and print information about the tallest formation.

### Extended Challenge
- Create a method to find only the tallest `Mesa`.

## Example Usage
This project demonstrates the use of interfaces, class implementation, polymorphism, and list traversal in Java.