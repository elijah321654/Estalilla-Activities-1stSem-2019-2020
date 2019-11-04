import java.io.*;
	public class AgeBuff{
		public static void main(String args [])throws IOException{

		int age;

		while(true){

			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

			try{
				System.out.print("Enter your age: ");
				age = Integer.parseInt(buff.readLine());
		
				if(age < 0)
	          		System.out.println("\tYou enter Negative Value");
	        	else if(age >122){
	          		System.out.println("\tYou enter Maximum Value");
	         
	      		}else if(age >= 0 && age <= 3){
		          		System.out.println("you're BABY");
		          break;
		      	}else if(age >= 4 && age <= 12){
		          System.out.println("you're  CHILD");
		          break;
		      	}else if(age >= 13 && age <= 19){
		          System.out.println("you're  TEEN");
		          break;
		      	}else if(age >= 20 && age <= 32){
		         System.out.println("you're YOUNG ADULT");
		         break;
		      	}else if(age >= 33 && age <= 45){
		          System.out.println("you're MIDDLE ADULT");
		          break;
		        }else if(age >= 46 && age <= 59){
		          System.out.println("you're ADULT");
		          break;
		      	}else if(age >= 60 && age <= 122){
		          System.out.println("you're a SENIOR");
		          break;
		        }
	     
	    	}catch(Exception e){
	    		System.out.println("\tInvalid Value");

		}
	}
 }
}
