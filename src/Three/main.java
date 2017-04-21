package Three;

import java.util.Scanner;

/**
 * Created by Александр on 21.04.2017.
 */
public class main {
    public static void main(String[] args) {
        DocumentWorker user = new DocumentWorker();
        Scanner scanner = new Scanner(System.in);
        String pass = "";
        String passPro = "pro";
        String passExp = "exp";
        int whatDo = 0;
        int x = 1;

        System.out.println("Введите ключ доступа");
        pass = scanner.next();

        if (pass.equals(passPro)) {
            ProDocumentWorker pro = new ProDocumentWorker();
            user = (ProDocumentWorker) pro;
            System.out.println("Вы получили доступ Про");
        } else if (pass.equals(passExp)) {
            ExpertDocumentWorker exp = new ExpertDocumentWorker();
            user = (ExpertDocumentWorker) exp;
            System.out.println("Вы получили доступ Эксперт");
        } else {
            System.out.println("Вы получили стандартный доступ.");
        }
        while (x == 1) {
            System.out.println();

            while (true) {
                System.out.println("Выберите действие:\n1. Открыть документ\n2. Изменить документ\n3. Сохранить документ\n4. Выход");

                try {
                    whatDo = Integer.parseInt(scanner.next());
                    break;
                } catch (Exception e) {
                    System.out.println("Неправельный ввод.");
                }
            }


            switch (whatDo) {
                case 1:
                    user.openDocument();
                    break;
                case 2:
                    user.editDocument();
                    break;
                case 3:
                    user.saveDocument();
                    break;
                case 4:
                    System.out.println("Дотвидания.");
                    x = 0;
                default:
                    System.out.println("Неправильная команда");
            }
        }
    }
}
