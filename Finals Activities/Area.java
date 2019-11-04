import java.text.DecimalFormat;
import java.util.Scanner;


	public class Area{
		public static void main(String args[]){
		DecimalFormat df= new DecimalFormat("0.00");
		 
		char shape;
		Scanner s= new Scanner(System.in);
		
		char choice;
		do{
			System.out.print("Use CAPITAL LETTER ONLY,Please follow the instruction\nC for Circle \nS for Square \nR for Rectangle \nT for Triangle \n Enter shape:");
			shape = s.next().charAt(0);
			switch (shape){
				case 'C':
        			System.out.println("Enter the radius:");
         			double r= s.nextDouble();
		         	double  area=(22*r*r)/7 ;
		         	System.out.println("Area of Circle is: " +df.format(area));  
					break;
				case 'S':
					System.out.println("Enter Side of Square:");    
		        	double side = s.nextDouble();
		        	double square = side*side; 
		        	System.out.println("Area of Square is: "+df.format(square));
	    			break;
	    		case 'R':
			    	System.out.println("Enter the length of Rectangle:");
			    	double length = s.nextDouble();
			    	System.out.println("Enter the width of Rectangle:");
			    	double width = s.nextDouble();
			    	double rec = length*width;
			    	System.out.println("Area of Rectangle is:"+df.format(rec));
			    	break;
	    		case 'T':
			    System.out.println("Enter the width of the Triangle:");
		        double base = s.nextDouble();
		        System.out.println("Enter the height of the Triangle:");
		        double height = s.nextDouble();
		        double tri = (base* height)/2;
		        System.out.println("Area of Triangle is: "+ df.format(tri));
		        break;
        	default :
        		System.out.println("Invalid");
			}
         	System.out.print("Do you want to try again?Y/N :");
         	choice = s.next().charAt(0);
	    }while ((choice == 'y') || (choice == 'Y'));
  
	}
}