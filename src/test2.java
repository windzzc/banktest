import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static double getCount(int n,double w,double[] a){
        double res;
        Arrays.sort(a);
        double temp = a[n];
        if(a[0]>=temp/2){
            res =temp/2*n+temp*n;
        }
        else res=a[0]*n+2*a[0]*n;
        res = Math.min(res,w);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double w = sc.nextDouble();
        double[] a = new double[2*n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextDouble();
        }
        double res=getCount(n,w,a);
        //String result = String.format("%.6f",res);
        System.out.format("%.6f",res);
    }
}
