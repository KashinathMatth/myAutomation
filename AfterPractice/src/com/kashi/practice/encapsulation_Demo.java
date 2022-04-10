package com.kashi.practice;
class account
{
	private long accno;
	private String name,email;
	private float ammount;
	
	public long getAcc_no ()
	{
		return accno;
	}
	
	public void setAcc_no(long accno)
	{
		this.accno=accno;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public float getAmmount()
	{
		return ammount;
	}
	
	public void setAmmount(float ammount)
	{
		this.ammount=ammount;
	}
}

public class encapsulation_Demo {

	public static void main(String[] args) {
		account a1=new account ();
		a1.setAcc_no(1000456789);
		a1.setName("kashinath matth");
		a1.setEmail("kashimatth@gmnail.com");
		a1.setAmmount(500000f);
		
		//System.out.println(a1.getAcc_no()+" "+a1.getName()+" "+a1.getEmail()+" "+a1.getAmmount());
		
		long s=a1.getAcc_no();
		System.out.println("The account Number is :"+s);
		
		String s2=a1.getName();
		System.out.println("The Holder name is: "+s2);
		
		String s3=a1.getEmail();
		System.out.println("The email id is :"+s3);
		
		float s4=a1.getAmmount();
		System.out.println("The Money is :"+s4);
	}

}
