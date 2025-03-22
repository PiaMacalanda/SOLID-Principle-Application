public class Dog extends Pet {
    
    private PetBehavior behavior;
    
    public Dog(String petName, String owner) {
        super(petName, owner);
        this.behavior = new DogBehavior();
    }
    
    public String makeSound() {
        return behavior.makeSound();
    }
    
    public String eat() {
        return behavior.eat();
    }
}