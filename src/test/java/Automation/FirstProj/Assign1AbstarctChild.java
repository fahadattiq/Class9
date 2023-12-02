package Automation.FirstProj;

public class Assign1AbstarctChild extends Assign1AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assign1AbstarctChild b = new Assign1AbstarctChild();
		b.animal();
		b.animalcolor();

	}

	@Override
	public void animalcolor() {
		// TODO Auto-generated method stub
		
		System.out.println("Color is brown");
		
	}

}
