
public class forLoop {
    public static void main(String[] args) {

        // 1. for loop
        //Syntax
        // for(initilization ; condition ; update){
        //     //code
        // }

        //Example 1
        // for(int i = 0; i <= 5; i++){
        //     System.out.println("Numbers : " + i);
        // }

        //Example 2
        // print the sum of n natural numbers
        int sum = 0;
        for(int  i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

//Write a program to print the multiplication table of a number entered by the user
