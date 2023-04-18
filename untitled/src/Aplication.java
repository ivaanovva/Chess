import java.util.Scanner;

/*
 * Кр - Король
 * Ф - Ферзь
 * Л - Ладья
 * С - Слон
 * К - Конь
 * для пешки в начале буквы пожалели
 */
public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommandValidator CV = new CommandValidator();
        int count = 5;
        int current = 1;
        String hod;
        while (current <= count) {
            hod = sc.nextLine();
            if (CV.validate(hod)) {
                if (current % 2 == 1) {
                    System.out.println("P1:" + hod);
                } else {
                    System.out.println("P2: " + hod);
                }
                current++;
            }
            else{
                System.out.println("Неверно введен ход");
            }
        }
    }
}

