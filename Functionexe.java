public class Functionexe {
     int Mul(int a, int b){
        int add= a * b;
        return add;
    }
    public static void main(String[] args) {
         Functionexe R = new Functionexe();
        int Result = R.Mul(2,2);
        System.out.println("Multification of Given Two Number is " +Result);
    }
}
