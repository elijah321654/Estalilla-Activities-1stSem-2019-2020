import java.util.Scanner;
	public class Agescanner {
		public static void main(String args[]){
			int age;
		
			while(true){
				try{
					
					Scanner a = new Scanner(System.in);
					System.out.print("Enter Age :");
					
					age = a.nextInt();
	              
	              	if(age < 0){
	                	System.out.println("\tyou enter Negative Age Value");
	              	}else if(age > 122){
	                	System.out.println("\tyou enter Maximum Age Value");
	             	 }else{
	              	if(age >= 0 && age <= 3){
	                	System.out.println("You're  BABY");
	             	 }else if(age >= 4 && age <= 12){
	               	 	System.out.println("You're  CHILD");
	             	 }else if(age >= 13 && age <= 19){
	                	System.out.println("Your  TEEN");
	             	 }else if(age >= 20 && age <= 32){
	                	System.out.println("You're  YOUNG ADULT");
	             	 }else if(age >= 33 && age <= 45){
	                	System.out.println("You're  MIDDLE ADULT");
	             	 }else if(age >= 46 && age <= 59){
	                	System.out.println("You're  ADULT");
	             	 }else if(age >= 60 && age <= 122)
	                	System.out.println("You're  SENIOR");
	               	 	break;
	              	 }
              
				}catch(Exception e){
				
					System.out.println("\tInvalid value " +e);
					 
				}
			}		
	}		
}