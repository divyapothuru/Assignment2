package overriding;

public class Car extends Vechicle{
private int noofdoors;

public Car(int noofwheel,int noofpassenger,int model,String make,int noofdoors) {
	super(noofwheel,noofpassenger,model,make);
	this.noofdoors = noofdoors;
}


public int getNoofdoors() {
	return noofdoors;
}


public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}


public void display()
{
	super.display();
	System.out.println("no of door"+noofdoors);
}
}
