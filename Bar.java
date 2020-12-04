import java.util.Scanner;

public class Bar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        
        for (int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        
        int c=0, sum=0;
        for(int i=0; i<=n-m; i++){
            for(int j=i; j<i+m; j++){
                sum+= a[j];
            }
            if(sum==d){
                c++;
            }
            sum=0;
        }
            
        System.out.println(c);
    }
}