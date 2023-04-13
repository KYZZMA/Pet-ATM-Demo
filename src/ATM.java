import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("/Логин для входа: 4521 | Пароль: 1234/");
        System.out.println();
        welcome();

    }

    public static void welcome() {
        System.out.println("Добро пожаловать в банк SberOff. Пожалуйста, введите ваш логин и пароль: ");
        AUT();
    }

    public static void AUT()  {

        AccountAut acc = new AccountAut();
        acc.autentif();

    }

}

