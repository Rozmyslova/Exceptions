import java.util.Scanner;


public class MainMenu {
    /**
     * @throws Exception
     * 
     */
    public static void main () throws Exception {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();


        PasswordVerifier pv = new PasswordVerifier();
        extracted(password, pv);

    }

    private static void extracted(String password, PasswordVerifier pv) throws Exception {
        pv.verifyPassword(password);
    }
}

