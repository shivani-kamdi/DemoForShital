package Blocks;

public class BlockProg {

	public static void main(String[] args) {
//           
		BlockProg a = new BlockProg();
		a.getClass();
	}
	static
	{
	System.out.println("This is static block");
	}
	//instance block => instance == object
	{
	System.out.println("This is instance block");
	}
	BlockProg()
	{
	System.out.println("This is constructor");
	}
	
	

}
