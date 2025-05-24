public class ReverseAlphaTriangle {
public static void main(String args[]){
    int row=5;
    int k=64+row;

    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)k++);
        }
        k=64+row-i;
        System.out.println();
        
    }
}
}
