// 1) What is the Mutable string in the java?Explain With an example.
//Ans:- The mutable strings are objrcts whose value can be changed after initialization.

public class Assignment3 {
      public static void main(String[] args) {
       //Example of mutable string 
        StringBuilder str=new StringBuilder("Atharva");
        System.out.println(str);
        str.append("Sawai");
        System.out.println(str);
        System.out.println();
        // 2)Write a program to reverse a string 
        //Input="PWSKILLS"
        //Output="SLLIKSWP"
        
        StringBuilder pw=new StringBuilder("PWSKILLS");
        System.out.println(pw.reverse());
      }
}