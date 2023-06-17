public class PrintingNumbers {
    public static void PrintNumbers(int n)
    {
        int i, j;

        for(i=0; i<n; i++)
        {
            if(i == 5){
                System.out.println("5");
            }
            if(i == 4){
                System.out.println("45");
            }
            if(i == 3){
                System.out.println("345");
            }
            if(i == 2){
                System.out.println("2345");
            }
            if(i == 1){
                System.out.println("12345");
            }
        }
    }

    public static void main(String[] args)
    {
        int n = 6;
        PrintNumbers(n);
    }
}
