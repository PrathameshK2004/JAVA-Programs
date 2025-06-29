public class rightAlignedInvertedTringle {
     public static void main(String[] args){   
        int row = 5;


        for(int i=1;i<=row;i++){

            for(int j= 1;j<i;j++){
                System.out.print(" ");
            }

            for(int k =i;k<=row;k++){
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
}
