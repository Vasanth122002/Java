package RealCodes;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  /*            0123456789
        String s = "vasanth name";
        System.out.println(s.indent(10));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("name"));
        System.out.println(s.indexOf('a', 2));
        System.out.println(s.indexOf("th", 2));
        System.out.println(s.lastIndexOf('a'));
        */
		//           0123456789
		 String s = " Vasanth Name ";
		 //System.out.println(s.charAt(0));
		// System.out.println(s.charAt(100));//java.lang.StringIndexOutOfBoundsException
		// System.out.println(s.charAt(-1));//java.lang.StringIndexOutOfBoundsException
		// System.out.println(s.substring(8));//starting
		 //System.out.println(s.substring(8, 12));//starting(included),ending(exclude)
		 //System.out.println(s.subSequence(8, 12));//implements charsequence interface
		 System.out.println(s.toLowerCase());
		 System.out.println(s.toUpperCase());
		 System.out.println(s.strip());//remove spaces before and after
		 System.out.println(s.length());//return integer
		 System.out.println(s.trim());
		 System.out.println(s.stripLeading());
		 System.out.println(s.stripTrailing());
		 System.out.println("repeted"+s.repeat(2));
		 System.out.println(s.toCharArray());
		 System.out.println(s.matches("\\w{7} \\w{4}"));
		 System.out.println(s.replace('a', 'e'));
		 System.out.println(s.replace("nth", "all"));
		 System.out.println(s.replaceAll("\\s", "-"));
		 System.out.println(s.replaceFirst("\\s", "-"));
		 String []s1 = s.split(" ");
		 String []s2 = s.split(" ", 3);
		 for(String str : s2)
		 System.out.println("split "+str);		 
		 System.out.println(String.join("-", "18","01","2000"));
		
		 //  int to  string
		 int no = 5;
		String s3 =  String.valueOf(no);
		 System.out.println("concat "+s3+5);	
		 System.out.println("add "+(no+5));	 
		 System.out.println(s.contains("name"));	//returns true || false
		 String s4 = " Vasanth Name 1234567890";
		for(int i = 0; i<s4.length();i++) {
		 if(s4.charAt(i)>='a'){
			 if(s4.charAt(i)<='z'){
				 System.out.print(s4.charAt(i));
			 } 
		 }
		 if(s4.charAt(i)>='A'){
			 if(s4.charAt(i)<='Z'){
				 System.out.print(s4.charAt(i));
			 } 
		 }
       }
		 System.out.println(" ");
	//------------------------------------
		String word = "0123456789";
		int number = Integer.parseInt(word);
		System.out.println(number);
		
		
		
		
}

}
