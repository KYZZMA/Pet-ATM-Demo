import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountAut {
    Scanner in = new Scanner(System.in);
    User user1 = new User();

    public void autentif() {

        final int userLog = 4521;
        final int userPin = 1234;
        while (true) {
            int login = 0;
            int pin = 0;
            try {
                System.out.print("Введите ваш логин: ");
                login = in.nextInt();
                System.out.print("Введите ваш пароль: ");
                pin = in.nextInt();
                System.out.println();

            } catch (InputMismatchException E) {
                System.out.println("Значения должны быть введены только в числовом формате.");
                ATM.AUT();
            }
            if (userLog == login && userPin == pin) {
                user1.action();
                break;
            } else {
                System.out.println("Логин или пароль введины неверно, попробуйте еще раз.");
            }

        }// реализуем аутентификацию пользователя
    }
}

