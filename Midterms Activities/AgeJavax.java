import javax.swing.JOptionPane;
	public class AgeJavax{
		public static void main(String args[]){
		int age;
		
		while(true){	
			try{
				age= Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
				System.out.print("Enter your age: ");
				
		
				if(age < 0)
		        	JOptionPane.showMessageDialog(null,"you enter Negative Value");
		        else if(age >122){
		        	JOptionPane.showMessageDialog(null,"you enter Maximum Value");
		        }else if(age<=3){
		         JOptionPane.showMessageDialog(null,"you're a BABY");
		          break;
		      	}else if(age<=12){
		          JOptionPane.showMessageDialog(null,"you're a CHILD");
		          break;
		      	}else if(age<=19){
		          JOptionPane.showMessageDialog(null,"you're a TEEN");
		          break;
		      	}else if(age<=32){
		         JOptionPane.showMessageDialog(null,"you're a YOUNG ADULT");
		         break;
		      	}else if(age<=45){
		          JOptionPane.showMessageDialog(null,"you're a MIDDLE ADULT");
		          break;
		        }else if(age<=59){
		          JOptionPane.showMessageDialog(null,"you're a ADULT");
		          break;
		      	}else if(age<=122){
		          JOptionPane.showMessageDialog(null,"you're a SENIOR");
		          break;
		        }
     
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null,"Invalid Value");
		}
	}
 }
}
