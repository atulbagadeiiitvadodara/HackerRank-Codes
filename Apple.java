import java.util.Scanner;


public class Apple{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int s, t, a, b, m, n;
        //System.out.println(" Enter Co-Ordinates : \n");
        s = in.nextInt();
        t = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        
        //System.out.println(" Enter No of Apples n Oranges : \n");
        m = in.nextInt();
        n = in.nextInt();
        
        int arr[] = new int[m];
        int a1[] = new int[n];
        
        for(int i=0;i<m;i++){
            arr[i] = in.nextInt();
        }
        
        for(int j=0;j<n;j++){
            a1[j] = in.nextInt();
        }
        
        int x1= s-a;
        int x2= t-a;
        int y1= s-b;
        int y2= t-b;
        
        int c=0,c1=0;
        for(int i=0;i<m;i++){
            if( arr[i]>=x1 && arr[i]<=x2){
                c++;
            }
        }
        
        for(int j=0;j<n;j++){
            if( a1[j]>=y1 && a1[j]<=y2){
                c1++;
            }
            }
            System.out.println(c);
            System.out.println(c1);
    }
}    