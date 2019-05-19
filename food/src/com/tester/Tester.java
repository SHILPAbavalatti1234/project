package com.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.shilpa.Home;
import com.shilpa.Hotel;

public class Tester 
{

	public static void main(String[] args) 
	{
		String pathofxml="Resources/spring.xml";
		BeanFactory beanfact=new ClassPathXmlApplicationContext(pathofxml);
		Hotel hotel=beanfact.getBean(Hotel.class);
		System.out.println(hotel);
		
		int a1=hotel.order("dosa", 3);
		System.out.println(a1);
		
	    Home m=beanfact.getBean("home", Home.class);
	    System.out.println(m);
		
		System.out.println(m.getAddress());
		System.out.println(m.getDoorno());
		System.out.println(m.getName());
		

		

		
		
		
	}

}
