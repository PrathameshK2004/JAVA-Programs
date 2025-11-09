import java.util.Scanner;
class fabSeries{
   static int count1= 0;
   static int count2= 0;

   public static int recursive(int n){
    count1++;
    if(n<=1){
        return n;
    }
    return recursive(n-1) + recursive(n-2);
   }

   public static int non_recursive(int n){
    count2++;
    if(n<=1) return n;
    int a=0,b=1,c=0;
    for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return b;

   }
   
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter range: ");
        int range = sc.nextInt();

        for(int i=0; i<range;i++){
            System.out.print(recursive(i)+" ");
        }
        System.out.println("recursive count: "+count1);

         for(int i=0; i<range;i++){
            System.out.print(non_recursive(i)+" ");
        }
        System.out.println("Non recursive count: "+count2);


    }
}
