import java.util.Scanner;

public class ReverseDigit {
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int number = input.nextInt();
        System.out.println("Reverse of no. is " + reverseDigits(number));
    }
}
