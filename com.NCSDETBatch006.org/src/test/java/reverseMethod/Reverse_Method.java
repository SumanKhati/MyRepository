package reverseMethod;

public class Reverse_Method {

	public static void main(String[] args) {

		
	
	        String str = "Hi, How Are You All";
	 
	        char[] str1 = str.toCharArray();
	 
	        for (int i = str1.length - 1; i >= 0; i--) {
	            System.out.print(str1[i]);
	        }
	        
	        System.out.println();
	    
	        
	        String st = "Testing";
	   	 
	        char[] str2 = st.toCharArray();
	 
	        for (int i = str2.length - 1; i >= 0; i--) {
	            System.out.print(str2[i]);
	        }
	        
	}

	
}
