package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;
import com.springcore.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World !" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");

        Employee ict = (Employee) applicationContext.getBean("Employee_1");
        System.out.println(ict.toString()); 
    }
}
