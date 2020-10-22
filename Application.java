package overriding;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("1.vec obj 2.car obj 3.cover obj 4.sport");
      int ch=sc.nextInt();
      if(ch==1)
      {
    	  Vechicle v=new Vechicle(1,2,3,"abc");
    	  v.display();
      }
      else if(ch==2)
      {
    	  Car c=new Car(2,4,1717,"car",7);
       	  c.display();
      }
      else if(ch==3)
      {
    	  Convertible con=new Convertible(4,5,1718,"convertable",2,true);
    	  con.display();
      }
      else
      {
    	  Sportcar s=new Sportcar(5,2,1719,"sportcar",10);
    	  s.display();
      }
	}

}
