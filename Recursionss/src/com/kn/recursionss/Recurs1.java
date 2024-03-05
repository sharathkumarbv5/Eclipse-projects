package com.kn.recursionss;

public class Recurs1 {

    public static void main(String[] args) {
        int result = multiply(5);
        System.out.println("The Multiplication is: " + result);
    }

    static int multiply(int a) {
        System.out.println(a);

        if (a == 1) {
            return 1;
        } else {
            return a * multiply(a - 1);
        }
    }
}




/*package com.kn.recursionss;

public class Recurs1 {

    public static void main(String[] args) {
        
    	
    	//int result = display(4);
        //System.out.println("The Factorial of Given Number is: " + result);
    }

    static int display(int a) {
        System.out.println(a);

        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * display(a - 1);
        }
    }
}



//System.out.println("Hello");
//a++;
//if(a<=5)
//a--;
//if(a>=1)
*/