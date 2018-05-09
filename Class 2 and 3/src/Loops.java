public class Loops {
    public static void main(String[] args){
        //Print number from 5 to 1 using FOR loop
        for(int i=5; i>=1; i--) {
            //System.out.println(i);
        }
        //Print number from 5 to 1 using WHILE loop
        int j=0;
        while(j<=8){
            j+=2;
            //System.out.println(j);
        }
        // Create a loop to print first 30 fibonacci numbers Also print the 10th Even Fib number
        int a=0;
        int b=1;
        int count =0;
        System.out.println(a);
        System.out.println(b);
        while(count <= 30){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            count++;
            if(count==8 && c%2==0){
                System.out.println("10th Even Fibonacci number is" + c);
            }
        }

        // Create a square number series
        for(int i=0; i<10; i++){
            System.out.println((int)Math.pow(i,2));
        }

        }


    }

