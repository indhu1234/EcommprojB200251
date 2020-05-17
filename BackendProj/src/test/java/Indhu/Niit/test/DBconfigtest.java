package Indhu.Niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Indhu.Niit.DBConfig;

public class DBconfigtest {;

	public static void main(String[] args)
	{
		 AnnotationConfigApplicationContext context=new 
				 AnnotationConfigApplicationContext();
		   context.scan("Indhu.Niit");
		   
		   context.refresh();	  
		   System.out.println("Configuration success");
	  }	
}


