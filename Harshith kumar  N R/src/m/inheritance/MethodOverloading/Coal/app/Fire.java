package m.inheritance.MethodOverloading.Coal.app;

public class Fire extends Coal{
	
	public Fire()
	{
		super();
		System.out.println("invoking coal is burning....");
	}
	@Override
	public void heat()
	{
		System.out.println("invoking coal is heating on fire....");
	}
	

}
