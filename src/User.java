import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    Scanner in = new Scanner(System.in);
    Transfer transfer = new Transfer();


    void action() {

        System.out.println("Здравствуйте, Александр, выберите необходимое действие");
        System.out.println();

        while (true){
            System.out.println("Информация по счетам: ");
            System.out.println("Cчет: 400040001 -- " + transfer.getFirstCheck() + " ₽");
            System.out.println("Cчет: 400040002 -- " + transfer.getSecondCheck() + " ₽");
            System.out.println();
            System.out.println("1) Показать историю счета");
            System.out.println("2) Пополнить счет");
            System.out.println("3) Снять со счета");
            System.out.println("4) Сделать перевод");
            System.out.println("5) Выход");

                int chose = in.nextInt();
                Transfer transfer = new Transfer();
                switch (chose) {
                    case (1) -> transfer.HistoryBalance();
                    case (2) -> transfer.refill();
                    case (3) -> transfer.withdrawal();
                    case (4) -> transfer.transferCheck();
                    case (5) -> ATM.welcome();
                }

            }
        }// реализуем выбор операций
    }

