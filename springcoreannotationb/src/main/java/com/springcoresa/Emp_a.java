package com.springcoresa;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp_a 
{ 
	//here is used @Autowired 
    //annotaion key case aap ju name="kuch bhi dedo koi issue nahi huga" aap key confi.xml file ma
	//autowire teen jagha used kar sakte hu .properties key upper getter and setter ,constructor key upper 
	
	@Autowired
	//1@Autowired
   private Address addres;
   
public Address getAddres() {
	return addres;
}
 //2 @Autowired

public void setAddres(Address addres) 
{
	this.addres = addres;
	System.out.println("this is our setter and getter method");
}

public Emp_a()
{
	super();
	// TODO Auto-generated constructor stub
}
  //3@Autowird
public Emp_a(Address addres) 
{
	
	super();
	this.addres = addres;
	System.out.println("this is our constructor");
}

@Override
public String toString() 
{
	return "Emp_a [addres=" + addres + "]";
}
  
}