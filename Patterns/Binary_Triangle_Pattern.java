public class Binary_Triangle_Pattern {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                int k=(j%2==0)?0:1;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
