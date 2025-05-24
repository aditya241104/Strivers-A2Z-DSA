public class Rectangle {

    public static void main(String args[]){
        int row=5;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=row;j++){
                if(i==row || j==row || j==0 || i==0){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}