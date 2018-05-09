public class HelloWorld {
    public static void main(String[] args){
        // Assignment# 1
        System.out.println("Hello World !");
        // EOA (End Of Assignment) #1

        // Assignment# 2
        boolean firstGdiClass = true;
        int programmingLanguagesIKnow ;
        //Scanner scan = new Scanner(System.in);
        programmingLanguagesIKnow = 4;
        System.out.println("This is my first GDI class: " + firstGdiClass);
        System.out.println("Programing Languages I know now:" + programmingLanguagesIKnow);


        double birthday = 7;
        birthday *=5;
        birthday -=1;
        birthday *=13;
        birthday +=23;
        birthday +=3;
        birthday *=11;
        birthday -=5;
        birthday -=23;
        birthday /=10;
        birthday +=11;
        birthday /=100;

        System.out.println("My Birthday is: " + birthday);
        //EOA Assgnmt#2

        //Assignment #3
        if (birthday>= 3.20 && birthday <=6.21) {
            System.out.println("Yay It's a Spring Birthday");
        }
        else if(birthday> 6.21 && birthday <=9.21) {
            System.out.println("Yay It's a Summer Birthday");
        }
        else if(birthday>= 9.22 && birthday <=12.20) {
            System.out.println("Yay It's a Fall Birthday");
        }
        else {
            System.out.println("Yay It's a Winter Birthday");
        }
        // EOA Asgmt #3

        int number = 9;
        if (number%2==0){
            System.out.println("It's an Even number");
        }
        else{
            System.out.println("It's an Odd number");
        }
        // EOA bonus Asgmnt #3

    }
}
