package spring_introduction;

import org.springframework.stereotype.Component;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Constructor of Dog");
    }

    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
