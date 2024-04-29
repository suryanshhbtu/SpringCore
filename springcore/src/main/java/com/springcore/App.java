package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student std = (Student) applicationContext.getBean("Student_1");
        System.out.println(std);
        std = (Student) applicationContext.getBean("Student_2");
        System.out.println(std);
        std = (Student) applicationContext.getBean("Student_3");
        System.out.println(std);
    }
}
