import java.util.Scanner;
import java.util.Random;


public class StringTest2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter how many code you want");
        int n = sc.nextInt();
        System.out.println("Your Verify code is : ");
        System.out.println(VerifyCode(n));

        
    }

    public static String VerifyCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwuxyzABCDEFJHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();

        for (int i = 0 ; i < n ; i++){
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }
}