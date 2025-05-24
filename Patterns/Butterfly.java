public class Butterfly {
    public static void main(String args[]){
        int row=10;
        for(int i=1;i<=row/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(row-2*i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row/2-1;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(row-2*i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
