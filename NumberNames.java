package DAY3;
import java.util.Scanner;

public class NumberNames {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        // Loop through each character in the input number
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            String name = "";
            
            switch (digit) {
                case '0':
                    name = "zero";
                    break;
                case '1':
                    name = "one";
                    break;
                case '2':
                    name = "two";
                    break;
                case '3':
                    name = "three";
                    break;
                case '4':
                    name = "four";
                    break;
                case '5':
                    name = "five";
                    break;
                case '6':
                    name = "six";
                    break;
                case '7':
                    name = "seven";
                    break;
                case '8':
                    name = "eight";
                    break;
                case '9':
                    name = "nine";
                    break;
                default:
                    name = "invalid";
            }
            
            System.out.print(name + " ");
        }
        
        scanner.close();
    }
}

