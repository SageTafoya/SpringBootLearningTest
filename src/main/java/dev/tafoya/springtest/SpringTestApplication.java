package dev.tafoya.springtest;

import foo.bar.WelcomeClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringTestApplication.class, args);

        var WelcomeClass = new WelcomeClass();

//        WelcomeClass.getWelcomeMessage().sout;
        System.out.println(WelcomeClass.GetWelcomeMessage());
    }


}
