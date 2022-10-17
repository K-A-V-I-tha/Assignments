package com.spring.springassign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Question;


public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext c= new ClassPathXmlApplicationContext("config.xml");
         Question q = (Question) c.getBean("que");
         q.display();
    }
}
