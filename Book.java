import java.util.Scanner;


public class Book{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        
        int front = p/2;
         
        int back = (n/2)-(p/2);
        if(front>back){
            System.out.println(back);
        }
        else{
            System.out.println(front);
        }
    }
}