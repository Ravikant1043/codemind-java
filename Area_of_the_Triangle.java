import java.util.*;
class ravi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        double p=sc.nextDouble();
        double k=sc.nextDouble();
        double s=(p+t+k)/2;
        double sp=(double)Math.sqrt(s*(s-p)*(s-t)*(s-k));
        System.out.format("%.2f",sp);
    }
}