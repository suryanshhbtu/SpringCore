package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import com.springcore.ref.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World !" );
        try(ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml")){
        	
        	Person p = (Person) applicationContext.getBean("person_1");
        	Addition a = (Addition) applicationContext.getBean("addition");
        	
        	System.out.println(a); 
        }catch (Exception e) {
        	e.printStackTrace();
			// TODO: handle exception
		}
        
    }
}
