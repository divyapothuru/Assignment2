package overriding;

public class Convertible extends Car{
private boolean ishoodopen;


public Convertible(int noofwheel,int noofpassenger,int model,String make,int noofdoors, boolean ishoodopen) {
	super(noofwheel,noofpassenger,model,make,noofdoors);
	this.ishoodopen = ishoodopen;
}


public boolean isIshoodopen() {
	return ishoodopen;
}


public void setIshoodopen(boolean ishoodopen) {
	this.ishoodopen = ishoodopen;
}


public void display()
{
	super.display();
	System.out.println("hood is open or close"+ishoodopen);
}
}
