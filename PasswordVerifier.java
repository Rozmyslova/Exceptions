/*
Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает 
строку пароля и проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */

public class PasswordVerifier {

    public void verifyPassword (String password) throws Exception {
        if (password.length() < 8 ) {
            throw new Exception("Password less than 8 symbols"); 
        }
    
        boolean passwordWithDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                passwordWithDigit = true;
                break;
            }
        }

        if (!passwordWithDigit) {
            throw new Exception("Password doesn`t contain digit");
        }

        boolean passwordWithUppercase = false;
        for (int i = 0; i < password.length(); i++ ) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                passwordWithUppercase = true;
                break;
            }
        }

        if (!passwordWithUppercase) {
            throw new Exception("Password doesn`t contain UpperCase");
        }

    }
}
 

