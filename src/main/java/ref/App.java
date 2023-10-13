package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ref=new ClassPathXmlApplicationContext("ref/Confige1.xml");
        A a=(A) ref.getBean("aref");
        B b=(B) ref.getBean("bref");
        System.out.println(a);
        System.out.println(b);
    }
}
