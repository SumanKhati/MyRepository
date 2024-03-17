package stringClassMethod1;

public class S_Methods {

	public static void main(String[] args) {

		// replace()
		String str = new String ("Jay Sri Ram");
		System.out.println("Before Replace :" +str);
		str = str.replace("Sri", "Siya");
		System.out.println("After Replace:" +str);
		
		
		System.out.println();
		
		//split()
		String str1 = "Hello Friends how are you";
		System.out.println(str1);
		String[] allval = str1.split(" ");
		for(String val:allval) {
			System.out.println(val);
		}
		
		System.out.println();

		//substring()
		String str2 = "I am an Sdet and worked in MNC";
		String str3 =str2.substring(5,7);     // index 5 "a" (bcoz index starting from 0) and no. of position 7 bcoz numbers starting from 1 so "n"
		System.out.println(str3);
		String str4 =str2.substring(5);       // if we give single no. then it will take no 5 as a index and print till the end.
		System.out.println(str4);
		
		
		System.out.println();

		
		//toCharArray()
		String str5 ="Testing";
		char[] allChars = str5.toCharArray();
		for (char val5 : allChars) {
			System.out.println(val5);
		}
		
		
		System.out.println();

		
		// toUppercase() and toLowercase()
		String str6 = "sdet";
		System.out.println(str6);
		str6 = str6.toUpperCase();
		System.out.println(str6);
		
		str6= str6.toLowerCase();
		System.out.println(str6);
		
		
		
		System.out.println();

		// trim()
		String st1 = "Suman    ";
		System.out.println(st1);
		String st2 = "     Suman";
		System.out.println(st2);
		String st3 = "     Suman    ";
		System.out.println(st3);
		System.out.println();
          st1=st1.trim();
         System.out.println(st1);
         st2=st2.trim();
         System.out.println(st2);
         st3=st3.trim();
         System.out.println(st3);
         
		
		
		
		
		
	}

}
