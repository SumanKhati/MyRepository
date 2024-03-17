package stringClassMethod;

public class StringMethods {

	public static void main(String[] args) {

		// charAt();
		String str = "SDET"; // s index value 0, D 1, E 2, t 3 .
		char z = str.charAt(0);
		System.out.println(z);
		char b = str.charAt(1);
		System.out.println(b);
		char a = str.charAt(2); // charAt(2) = E
		System.out.println(a); // print a = E
		char c = str.charAt(3);
		System.out.println(c);

		
		// compareTo();
		System.out.println();
		
		String str1 = "SDET";
		String str2 = "sdet";

		int val = str1.compareTo(str2);
		System.out.println(val);

		String str3 = "sdet";
		String str4 = "SDET";

		int val2 = str3.compareTo(str4);
		System.out.println(val2);

		String str5 = "sdet";
		String str6 = "sdet";

		int val3 = str5.compareTo(str6);
		System.out.println(val3);

		String str7 = "";
		String str8 = "";

		int val4 = str7.compareTo(str8);
		System.out.println(val4);

		String str9 = "";
		String str10 = "Sdet";

		int val5 = str9.compareTo(str10);
		System.out.println(val5);

		// concat();
		System.out.println(); 
		
		String str11 = "SUMAN";
		String val6 = str11.concat("  RAJPUT");
		System.out.println(val6);
		
		
		//contains();
		System.out.println();
		
		String str12= "I Love Chandigarh";
		Boolean val7 = str12.contains("Mohali");
		System.out.println(val7);
		
		String str13= "I Love Chandigarh";
		Boolean val8 = str13.contains("Love");
		System.out.println(val8);
		
		
	    //equals();
		System.out.println();
		
		String str14 = "testing";
		String str15 = "TESTING";
		Boolean val9 = str14.equals(str15);
		boolean val10 = str14.equalsIgnoreCase(str15);
		System.out.println(      "    " + val9);
		System.out.println(     "     "   + val10);
		
		System.out.println();
		System.out.println("equals()");

		String aa = "TESTING";
		String bb = "TESTING";
		Boolean v1 = aa.equals(bb);
		boolean v2 = aa.equalsIgnoreCase(bb);
		System.out.println(v1);
		System.out.println(v2);
		
		
		//indexOf();
		String str16 = "Testing";
		int val11= str16.indexOf("t");
		System.out.println(val11);                        // index 3
		
		String str17 = "MAHARAJA";
		int val12 =str17.indexOf("A");
		System.out.println(val12);                      //index 1
			
				
		//lastIndexOf();
		
		
		
		System.out.println();
		
		String str18 = "SUMAN";
		
       int val13 = str18.lastIndexOf('M');
		          
		System.out.println(val13);
		
		
		String str19 = "Rajput";
		
	       int val14 = str19.lastIndexOf('p');
			          
			System.out.println(val14);
			
		
		// isEmpty(;
			
			System.out.println();
			System.out.println("isEmpty()");

			String str20 = "";
		   boolean val15= str20.isEmpty();
		System.out.println(val15);
		
			
		String str21 = " ";
		   boolean val16= str21.isEmpty();
		System.out.println(val16);
		
		
		//length();
		
		System.out.println();
		System.out.println("length()");
		
		
		String str22 = "suman";
		int val17 = str22.length();
		System.out.println(val17);
		
		
	}

}
