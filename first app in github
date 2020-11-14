import java.util.*;
public class HelloWorld {
     public static void main(String [] args){
         // variables place //
         int check,choose =4;
         String mes;
         String x;
         coder s = new coder();
         // end of the block //  
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Hello User");
            System.out.println("Please enter your message");
            mes = input.nextLine();
            System.out.println("Please Enter 1 to encrypt or 2 to decrypt");
            check = input.nextInt();
            
            switch (check){
                case 1:
                    x= s.encryption(mes);
                    System.out.println("your encrypted message is ");
                    System.out.println(x);
                    break;
                    
                case 2:
                    x= s.decryption(mes);
                    System.out.println("your decypted message is ");
                    System.out.println(x);
                    break;
                default:
                    System.out.println("Wrong input");
            }
        System.out.println("Please Enter 0 to exit");
        choose = input.nextInt();
        } while (choose!=0);
    }
}

