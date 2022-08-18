package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet cat = context.getBean("myPet", Pet.class);
        cat.say();
        context.close();
    }
}
