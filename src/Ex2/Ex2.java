package Ex2;

public class Ex2 {
    public static void main(String[] args) {

        int SumUsingFor = 0;
        for( int i = 1; i <= 10; i++ ) {
            SumUsingFor += i;
        }
        System.out.println("Sum using for loop = " + SumUsingFor);

        int SumUsingDoWhile = 0;
        int i = 1;
        do{
            SumUsingDoWhile += i;
            i++;
        }while(i <= 10);
        System.out.println("Sum using do while = " + SumUsingDoWhile);

        int SumUsingWhile = 0;
        i = 1;
        while(i <= 10){
            SumUsingWhile += i;
            i++;
        }
        System.out.println("Sum using while loop = " + SumUsingWhile);
    }
}
