package org.example;

import interfaces.Animal;
import models.Person;
import models.Snake;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        person.show();

        System.out.println("#############################");

        Person person1 = applicationContext.getBean("person1", Person.class);
        System.out.println(person1);
        person1.show();

    }

}
