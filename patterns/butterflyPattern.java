public class butterflyPattern {
     public static void main(String[] args){   
        int row = 5;


        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
           
            for(int k=1;k<=2*(row-i);k++){
                System.out.print(" ");
            }
              for(int j=1;j<=i;j++){
                System.out.print("*");

            }

             System.out.println(" ");
        }

        for(int i=row-1;i>=1;i--){
            
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int sp=2*((row)-i);
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
              for(int j=1;j<=i;j++){
                System.out.print("*");

            }

             System.out.println(" ");
        }

        
    }
    
}

