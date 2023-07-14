package com.springcoresa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("emps.xml");
        Emp_a emp1=(Emp_a)context.getBean("emp");
        System.out.println(emp1);
        
        //<context:annotation-config/> ya anotaion used kiya jata hai data ko consol per print karega
        //nahi used kiya tu null aaya ga
          
        
      
    }
}
