public class DogBehavior implements PetBehavior {
    @Override
    public String makeSound() {
        return "Woof!";
    }
    
    @Override
    public String eat() {
        return "Dog is eating dog food";
    }
}