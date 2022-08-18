package spring_introduction;

public class Test1 {

    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        testPet(dog);
        testPet(cat);
    }

    public static void testPet(Pet pet){
        pet.say();
    }
}
