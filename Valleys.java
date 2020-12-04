import java.util.*;

public class Valleys{
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    String s = in.nextLine();
    String str = in.nextLine();
    
    int c=0, ans=0;
    
    for(int i=0; i<str.length(); i++){
      
      if( str.charAt(i)==68 ) c--;
      else c++;
      
      if( c==0 && str.charAt(i)==85 ) ans++;
      
    }
    
    System.out.println(ans);
    
  }
}
    
    