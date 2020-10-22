package overriding;

public class Vechicle {
private int noofwheel;
private int noofpassenger;
private int model;
private String make;

public Vechicle(int noofwheel, int noofpassenger, int model, String make) {
	//super(model);
	this.noofwheel = noofwheel;
	this.noofpassenger = noofpassenger;
	this.model = model;
	this.make = make;
}

public int getNoofwheel() {
	return noofwheel;
}

public void setNoofwheel(int noofwheel) {
	this.noofwheel = noofwheel;
}

public int getNoofpassenger() {
	return noofpassenger;
}

public void setNoofpassenger(int noofpassenger) {
	this.noofpassenger = noofpassenger;
}

public int getModel() {
	return model;
}

public void setModel(int model) {
	this.model = model;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public void display()
{
	System.out.println("make:"+make+"model:"+model+"noofwheel"+noofwheel+"passenger"+noofpassenger);
}

@Override
public String toString() {
	return "Vechicle [noofwheel=" + noofwheel + ", noofpassenger=" + noofpassenger + ", model=" + model + ", make="
			+ make + "]";
}

}
