package Automation.FirstProj;

//Polymhorphism
class garden
{    //Method
public void type()
{
	System.out.println("Society Garden");
}}
class tree
{	//method
	public void cate()
	{
		System.out.println("Fruits and simple Trees");
	}
}
//inheritance: creating a plants class and inherited with garden class
class plants extends garden //Inheritance
{
	//method
	public void kind() {
	System.out.println("Flower plants");
	}
}
public class Assign1InherPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//objects of classes and methods
		//garden p = new garden();
	    //p.type();
		//tree q = new tree();
		//q.cate();
		plants r = new plants();
		r.kind(); //kind is coming from plants class because kind is its function/method
		r.type(); // type is coming with the r because it is inherited with the parent class garden.
	}
}
