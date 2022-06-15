import java.util.Scanner;

public class UserInput_Function {
    int Divition(int x, int y){
        int Divi = x/y;
        return Divi;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The First number :");
        int Input1 = Input.nextInt();
        System.out.print("Enter The Second Number : ");
        int Input2 = Input.nextInt();
        UserInput_Function R = new UserInput_Function(); // Calling Object becouse in function/method vairable is Instance
        int Result= R.Divition(Input1,Input2);
        System.out.println("Divition of Given Two Number is " +Result);


    }
}
