import java.util.Scanner;


public class DayProgrammer{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int d=12;
        
        int d1=13;
        if(y<1918){
            if(y%4==0){
                System.out.println(d+".09."+y);
            }
            else{
                System.out.println(d1+".09."+y);
            }
        }
        else if(y>1918){
            if(y%400==0 || (y%4==0 && y%100!=0)){
                System.out.println(d+".09."+y);
            }
            else{
                System.out.println(d1+".09."+y);
            }
        }
        else if(y==1918){
            System.out.println("26.09.1918");
        }
    }
}