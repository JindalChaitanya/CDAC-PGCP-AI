// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q7. Write a program to check all the three numbers entered by command line arguments are greater than 10 , then print the sum of those numbers . If any number is less than 10 then throw a user defined exception “MyException”. Which print message number is lesser then 10 “

package Assignment4;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Q7 {
    public static void main(String[] args) {

        try {
            if (args.length != 3) {
                System.out.println("Please provide exactly 3 numbers.");
                return;
            }

            int sum = 0;
            for (int i = 0; i < 3; i++) {
                int num = Integer.parseInt(args[i]);

                if (num <= 10) {
                    throw new MyException(num+" is lesser than 10");
                }
                sum += num;
            }

            System.out.println("Sum = " + sum);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter integers only.");
        }
    }
}