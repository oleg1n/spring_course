package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("We are getting a book from UniLibrary");
    }

    public void getMagazine(){
        System.out.println("We are getting a magazine from UniLibrary");
    }
}
