package CarTracker;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Runner {

    public Runner()
    {
        System.out.println("Inside the Runner constructor");
    }

    public void sayHello()
    {
        System.out.println("Hello Harshini");
    }
}
