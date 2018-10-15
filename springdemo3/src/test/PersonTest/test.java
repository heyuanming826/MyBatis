package PersonTest;

import com.newer.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService service =ctx.getBean("proxyPersonService",PersonService.class);
        service.addPerson();
        System.out.println("-----------");
       // service.deletePerson();
        System.out.println("--------------------");

        service.findPerson(100);
    }
}
