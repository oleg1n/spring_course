package spring_introduction;

import org.springframework.stereotype.Component;


public class Cat implements Pet{

    public Cat() {
        System.out.println("Constructor of Cat");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
