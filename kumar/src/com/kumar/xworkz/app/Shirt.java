"pumapackage com.Xworkz.kumar.app;

public class Shirt {
	
	private String brand;
	private String color;
	private char size;
	private Botton shape;
	
	
	public Shirt(String brand,String color,char size)
	{
		System.out.println("invoking main in shirt in botton");
		this.brand="brand";
		this.color="color";
		this.size='L';
		}
	public void setShape(Botton shape)
	{
		this.shape=shape;
	}
	public void disign()
	{
		System.out.println("invoking good design shirt");
		this.shape.attachment();
	}

}
