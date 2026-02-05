import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    while(n>0){
        
        int p=sc.nextInt();
        
        if(p<=4){
            System.out.println("-1");
            n--;
            continue;
        }
        
        List<Integer> res=new ArrayList<>();
        
        for(int k=2;k<=p;k+=2){
            if(k!=4){
                res.add(k);
            }
        }
        res.add(4);
        res.add(5);
        
        for(int j=1;j<=p;j+=2){
            if(j!=5){
                res.add(j);
            }
        }
        
        for(int l=0;l<res.size();l++){
            System.out.print(res.get(l)+" ");
        }
        n--;
    }
  }
}
