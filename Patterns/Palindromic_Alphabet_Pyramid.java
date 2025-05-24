public class Palindromic_Alphabet_Pyramid {
    public static void main(String args[]){
        int A=65;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)A++);
            }
            A--;
            for(int k=i;k>1;k--){
                System.out.print((char)--A);
            }
            System.out.println();
        }
    }
}
