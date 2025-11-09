import java.util.Scanner;
class knapsack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of item you want to enter: ");
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter value and weight of item "+(i+1)+" :" );
            value[i]=sc.nextInt();
            weight[i] = sc.nextInt();
        }
        
        System.out.println("enter capacity: ");
        int capacity = sc.nextInt();

        double[] ratio = new double[n];

        for(int i=0;i<n;i++){
           ratio[i] = (double) value[i]/weight[i];

        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ratio[i] < ratio[j]){
                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    int tempval = value[i];
                    value[i]=value[j];
                    value[j]=tempval;

                    int tempwt= weight[i];
                    weight[i]= weight[j];
                    weight[j]= tempwt;
                }   
            }
        }
        double totalval=0;
        int currentWeight=0;
        for (int i=0;i<n;i++){
            if(currentWeight + weight[i] <= capacity){
                currentWeight = currentWeight + weight[i];
                totalval += value[i];
            }
            else{
                int remaining =capacity-currentWeight;
                totalval += value[i] *((double) remaining/weight[i]);
                break;
            }
        }
        System.out.println("knapsack total value: "+totalval);
    }   
}