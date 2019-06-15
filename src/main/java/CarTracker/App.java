package CarTracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting Main");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After context");
        Runner runobj1 = context.getBean(Runner.class);
        Runner runobj2 = context.getBean(Runner.class);
        runobj1.sayHello();
        System.out.println(runobj1==runobj2);

        context.close();
    }
}
