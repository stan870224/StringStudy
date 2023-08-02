import java.util.Scanner;


public class StringTest1{
    public static void main(String[] args) {
        for (int i = 0 ; i < 3 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your name");
            String LoginName = sc.next();
            System.out.println("Please Enter your Password");
            String LoginPassword = sc.next();

            boolean rs = login(LoginName,LoginPassword);
            if (rs){
                System.out.println("Welcome to the System !!");
                break;
            }else{
                System.out.println("The account number or password is incorrect , please check again !!!");
            }
        }
    }

    public static boolean login(String LoginName ,String LoginPassword){
        String okLoginName = "itheima" ;
        String okPassWord = "123456" ;

        if (okLoginName.equals(LoginName) && okPassWord.equals(LoginPassword)){
            return true;
        } else{
            return false;
        }
    }
}