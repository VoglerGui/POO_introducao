package entities;

public class School 
{
	
	public String name;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double pass() 
	{	
		return tri1 + tri2 + tri3;
	}
	
	public double failed()
	{
		return 60 - pass();
	}
	
	public String toString()
	{
		return String.format("%.2f\n", pass()); 
	}

}
