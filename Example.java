import java.util.*;
class Box{
	double length;
	double width;
	double height;
	
	public void setSize(double length, double width, double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public void printVolume(){
		double volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public Box getCopy(){
		Box b1=new Box();
		b1.setSize(this.length,this.width,this.height);
		return b1;
	}
}
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input length : ");
		double length=input.nextDouble();
		System.out.print("Input width : ");
		double width=input.nextDouble();
		System.out.print("Input height : ");
		double height=input.nextDouble();
		System.out.println();
		
		Box b1= new Box();
		b1.setSize(length,width,height);
		b1.printVolume();
		
		Box b2;
		b2=b1.getCopy();
		
		b2.printVolume();
		System.out.println(b1==b2);
	}
}
