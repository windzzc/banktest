import java.util.Scanner;

public class Main {
    public static int getCount(int n,int a,int b,int c){
        if(n/c<a) return n/c;
        else{
            return (a+b)*(n/(a*c))+(n%(a*c)/c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(getCount(n,a,b,c));
    }
}
