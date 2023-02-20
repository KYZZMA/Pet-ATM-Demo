import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountAut {
    Scanner in = new Scanner(System.in);

    public void autentif() {


        int userLog = 4521;
        int userPin = 1234;
        while (true) {

            System.out.print("Введите ваш логин: ");
            int login = in.nextInt();
            System.out.print("Введите ваш пароль: ");
            int pin = in.nextInt();
            System.out.println();

                if (userLog == login && userPin == pin) {
                    User user1 = new User();
                    user1.action();
                    break;
                } else {
                    System.out.println("Логин или пароль введины неверно, попробуйте еще раз.");
                }

            }
        }// реализуем аутентификацию пользователя
    }

