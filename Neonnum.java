import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        int q=1, r=0;
        int sum= 0;
        while(sq!=0)
        {
        
        r = sq%10;
        sum = sum + r;
        sq = sq/10;
        
    }
    
    if(n==sum){
        System.out.println("n is a neon number");
    }
    else{
        System.out.println("n is not a neon number");
    }
}
}
