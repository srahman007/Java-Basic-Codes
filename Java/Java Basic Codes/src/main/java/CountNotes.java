import java.util.Scanner;

public class CountNotes {
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounter = new int[10];

        for (int i = 0; i < 10; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }


        for (int i = 0; i < 10; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    public static void main(String args[]){
        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        int amounts = input.nextInt();
        countCurrency(amounts);
    }
}
