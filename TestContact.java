
public class TestContact {
	
    public static void main(String[] args)  {  
    	
    	
		
    	
       //Read user input		
		int looper = -1;
		
		do{
			Contact read = new Contact();
			read.read();
			
			Contact sorter = new Contact();
			//sorter.sorter();
			
			if(looper == -1) System.out.println(read +"\n"+"\n");	
			
			
			else{
				//Retrieve list after read
				System.out.println("......CONTACTS ARE...... " +"\n" + read.toString());
				System.out.print(sorter);
				
			}
			looper = looper+2;
			
		} while (looper < 3);
	  // Finish the line
			
		
		
		
		
    
    	 
    	 
    
    }

	
}

