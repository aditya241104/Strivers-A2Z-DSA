package simplemaths;

public class GCD {
    public static void main(String args[]){
        System.out.println(gcd(20,50));
    }
    static int gcd(int a , int b ){
        if(b==0){
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
}
