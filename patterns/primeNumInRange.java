public class primeNumInRange {
    public static void main(String args[]){   
        int range =100;

         
        for(int i=2;i<=range;i++){
             int isprime=1;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isprime=0;
                    break;
                }
            }

            if(isprime==1){
                System.out.println(i);
            }
           

        }
    }    
}
