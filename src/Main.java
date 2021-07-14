import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AddressBook userInfo = new AddressBook();
        Scanner kybd = new Scanner(System.in);

        System.out.println("Enter your name: ");
        userInfo.setName(kybd.nextLine());

        System.out.println("Enter your address: ");
        userInfo.setAddress(kybd.nextLine());

        System.out.println("Enter your city: ");
        userInfo.setCity(kybd.nextLine());

        System.out.println("Enter your state: ");
        userInfo.setState(kybd.nextLine());

        System.out.println("Enter your zip code: ");
        userInfo.setZip(kybd.nextLine());

        System.out.println("Enter your phone number: ");
        userInfo.setPhoneNumber(kybd.nextLine());

        while(!userInfo.setIsPhoneNumberValid()){
            System.out.println("Please enter phone number correctly: ");
            userInfo.setPhoneNumber(kybd.nextLine());
        }

        System.out.println("Enter your email: ");
        userInfo.setEmail(kybd.nextLine());

        while(!userInfo.setIsEmailValid()){
            System.out.println("Please enter email correctly: ");
            userInfo.setEmail(kybd.nextLine());
        }

        System.out.println(userInfo.displayData());
    }
}
