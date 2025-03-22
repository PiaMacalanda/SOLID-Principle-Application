# Pet Management Application

### Problem (To Solve)
The following object violates Single Responsibility Principle (SRP). Make the adjustment in a form of java code to correct the violation.
![Image](https://github.com/user-attachments/assets/e1b5b21a-b5cc-49be-ab5f-5949d0df38ab)

## Overview
This application demonstrates the application of the Single Responsibility Principle (SRP) from SOLID principles in object-oriented design. The original `Pet` class violated SRP by handling both pet information and pet behaviors in a single class. The refactored solution separates these responsibilities into distinct classes and interfaces.

## Classes and Interfaces

### Pet
Responsible for managing basic pet information:
- `petName`: The name of the pet
- `owner`: The owner of the pet
- Getters and setters for these properties

### PetBehavior (Interface)
Defines the behaviors that pets can perform:
- `makeSound()`: The sound a pet makes
- `eat()`: How a pet eats

### DogBehavior
An implementation of `PetBehavior` specifically for dogs:
- Implements `makeSound()` to return "Woof!"
- Implements `eat()` to describe how a dog eats

### Dog
A specific pet type that:
- Extends the `Pet` class to inherit information management
- Contains a `PetBehavior` instance to handle behaviors
- Delegates behavior methods to the behavior instance

## Design Principles Applied

### Single Responsibility Principle (SRP)
Each class has only one reason to change:
- `Pet` only changes if pet information management needs to change
- `PetBehavior` only changes if the behavior interface needs to change
- `DogBehavior` only changes if dog-specific behaviors need to change

### Benefits of this Design
1. **Maintainability**: Changes to one aspect don't affect others
2. **Extensibility**: New pet types can be added without modifying existing code
3. **Reusability**: Behaviors can be reused across different pet types
4. **Testability**: Each component can be tested independently

## SRP UML Diagram
![Image](https://github.com/user-attachments/assets/b5b1fde9-c284-4990-9cff-3d2e36260bc4)
