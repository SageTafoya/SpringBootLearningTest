package foo.bar;

import org.springframework.stereotype.Component;


@Component
public class WelcomeClass
{

    public String GetWelcomeMessage()
    {
        return "Welcome to the spring boot application! \nYou better be ready to ROCK!!!";
    }
}