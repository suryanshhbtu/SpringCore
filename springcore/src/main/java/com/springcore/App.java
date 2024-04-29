package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;
import com.springcore.entity.Student;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");

        A a = (A) applicationContext.getBean("aref");
        System.out.println(a); 
    }
}
