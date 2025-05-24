public class AlphaTriangle {
    public static void main(String args[]){
        int k=65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)k++);
            }
            k=65;
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)k++);
            }
            k=65;
            System.out.println();
        }
    }
}
