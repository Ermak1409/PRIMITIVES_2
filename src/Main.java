public class Main {
    public static void main(String[] args) {

        // Переменные и входные данные
        int account = 100;
        int koef = 100;
        int insert = 1100;
        int bonus = 0;

        //Расчет
        if (insert > 1000) {
            bonus = insert / koef;
        }
        account = account + insert + bonus;

        // Вывод
        System.out.print("Ваш бонус составил  " + bonus + " руб. ");
        System.out.print("На вашем счете " + account + " руб.");
    }
}
