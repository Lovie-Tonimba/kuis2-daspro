import java.util.Scanner;
public class quiz244107060101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A.Create a two-dimensional array program that is used to input the stock in the library
        String [] listBook = {"Database", "Mathematics", "Algorithm"};
        String [] conditionBook = {"In stock", "Damaged Stock", "Out of stock"};
        int [][] array = new int[listBook.length][conditionBook.length];
        
        System.out.println("==========Input the stock in the library==========");
        for (int i = 0; i < array.length; i++) {
            System.out.println(listBook[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("  " + conditionBook[j] + " : ");
                array[i][j] = sc.nextInt();
            }
        }

        //B. Calculate the total stock of books in the library that can still be borrowed.
        System.out.println("==========Calculate the total stock of books in the library that can still be borrowed==========");
        int bookCanBorrowed = 0;
        for(int i = 0; i < array.length; i++){
            bookCanBorrowed += array[i][0];
        }
        System.out.println("Total stock of books in the library that can still be borrowed is " + bookCanBorrowed);

        //C. Display the name of the book with the largest number of books that can be borrowed
        System.out.println("==========Display the name of the book with the largest number of books that can be borrowed==========");
        int bookCanBeBorrowed = 0;
        int maxBook = 0;
        String nameMaxBook = " ";
        for(int i = 0; i < array.length; i++){
            bookCanBeBorrowed = array[i][0];
            System.out.println("Total stock of books " + listBook[i] + " that can be borrowed is " + bookCanBeBorrowed);
            if(bookCanBeBorrowed > maxBook){
                maxBook = bookCanBeBorrowed;
                nameMaxBook = listBook[i];
            }
        }
        System.out.println("Book " + nameMaxBook + " has the largest number which " + (maxBook) + " of books that can be borrowed");

        //D. Show the names of books that are heavily borrowed!
        System.out.println("==========Show the names of books that are heavily borrowed==========");
        String nameBooksHeavilyBorrowed = " ";
        for(int i = 0; i < array.length; i++){
            int bookHeavilyBorrowed = 0;
            bookHeavilyBorrowed += array[i][2];
            nameBooksHeavilyBorrowed = listBook[i];
            System.out.println("Book " + nameBooksHeavilyBorrowed + " with number of books " + bookHeavilyBorrowed + " that out of stock");
        }
    }
}