package com.java.practice71;

public class TextProcessor {
          public static void textprocessor(String str) {
        	  String uCS=Utility.convertToUpperCase(str);
        	  System.out.println("upperCase: "+uCS);
        	  // same thing 
        	  //System.out.println("upperCase: "+Utility.convertToUpperCase(str));
          
          //Using the instance method from Utility
          Utility u=new Utility();
          String lCS = u.convertToLowerCase(uCS);
          System.out.println("loverCase: "+lCS);
}
}