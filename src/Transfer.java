import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Transfer {
    Scanner in = new Scanner(System.in);
    public static List<String> historyBal = new ArrayList<>();
    Date date = new Date();

    private static double firstCheck = 0.0;
    private static double secondCheck = 0.0;

    public double getFirstCheck() {
        return firstCheck;
    }

    public double getSecondCheck() {
        return secondCheck;
    }


    public void HistoryBalance() {
        if (historyBal.size() == 0) {
            System.out.println("Истории операций нет.");
            System.out.println();
        } else {
            for (Object i : historyBal) {
                System.out.println(i);
            }
            System.out.println();

        }
    }//реализуем историю операций

    public double refill() {

        System.out.print("Выберите счет для пополнениея (1-2): ");

        int chose =0;
        try {
            chose = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Необходимо ввести значения (1-2), попробуйте снова.");
            System.out.println();
            return refill();}


            if (chose == 1) {
                System.out.print("Введите сумму пополнения: ");
                double transSumm = in.nextDouble();
                if (transSumm <= 0){
                    System.out.println("Введенная сумма не может быть отрицательной, или равной : 0");
                }else {
                    firstCheck += transSumm;
                    System.out.println("Ваш счет: 400040001 успешно пополнен на " + transSumm + " ₽");
                    System.out.println();
                    historyBal.add("Пополнение счета 400040001 на сумму: " + transSumm + " ₽" + "Операция совершена: " + date.toString());
                    return firstCheck;
                }
            }

            if (chose == 2) {
                System.out.print("Введите сумму пополнения: ");
                double transSumm = in.nextDouble();
                secondCheck += transSumm;
                System.out.println("Ваш счет: 400040002 успешно пополнен на " + transSumm + " ₽");
                System.out.println();
                historyBal.add("Пополнение счета 400040002 на сумму: " + transSumm + " ₽" + "Операция совершена: " + date.toString());
                return secondCheck;

            } else {
                System.out.println("Введите корректное значение, попробуйте еще раз. ");
                return refill();
            }

        } // реализуем пополнение счетов
        public double withdrawal () {

            System.out.print("С какого счета необходимо снять средства? (1-2): ");

            int chose = in.nextInt();


            if (chose == 1) {
                System.out.print("Введите сумму снятия: ");
                int withdrawalSumm = in.nextInt();
                if (firstCheck < withdrawalSumm) {
                    System.out.println("На вашем счете недостаточно средств для данной операции.");
                    System.out.println();
                    return -1;
                } else {
                    System.out.println("C вашего счета: 400040001 успешно снято: " + "(" + withdrawalSumm + ")");
                    System.out.println();
                    historyBal.add("Снятие со счета 400040001 на сумму: " + withdrawalSumm + " ₽. " + "Операция совершена: " + date.toString());
                    return firstCheck -= withdrawalSumm;
                }

            }

            if (chose == 2) {
                System.out.print("Введите сумму снятия: ");
                int withdrawalSumm = in.nextInt();
                if (secondCheck < withdrawalSumm) {
                    System.out.println("На вашем счете недостаточно средств для данной операции.");
                    System.out.println();
                    return -1;
                } else
                    System.out.println("C вашего счета: 400040002 успешно снято: " + "(" + withdrawalSumm + ")");
                System.out.println();
                historyBal.add("Снятие со счета 400040002 на сумму: " + withdrawalSumm + " ₽. " + "Операция совершена: " + date.toString());
                return secondCheck -= withdrawalSumm;
            } else {
                System.out.println("Введите корректное значение, попробуйте еще раз. ");
                return withdrawal();
            }
        } //реализуем снятия со счетов
        public void transferCheck () {
            System.out.print("C какого счета вы хотите перевести средства? (1-2): ");
            int chose = in.nextInt();
            if (chose == 1) {
                System.out.print("Какую сумму вы хотите перевести?: ");
                double summ = in.nextDouble();
                if (summ > firstCheck) {
                    System.out.println("На вашем счете недостаточно средств для данной операции.");
                    System.out.println();
                    return;
                } else {
                    firstCheck -= summ;
                    secondCheck += summ;
                    historyBal.add("Перевод со счета 400040001 на счет 400040002 сумму: " + summ + " ₽. " + "Операция совершена: " + date.toString());
                }
            }
            if (chose == 2) {
                System.out.print("Какую сумму вы хотите перевести?: ");
                double summ = in.nextDouble();
                if (summ > secondCheck) {
                    System.out.println("На вашем счете недостаточно средств для данной операции.");
                    System.out.println();
                } else {
                    secondCheck -= summ;
                    firstCheck += summ;
                    historyBal.add("Перевод со счета 400040002 на счет 400040001 сумму: " + summ + " ₽. " + "Операция совершена: " + date.toString());
                }
            }

        } //реализуем перевод с одного счета на другой


    }


