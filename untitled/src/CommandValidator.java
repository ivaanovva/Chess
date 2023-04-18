/*
 * B - Король
 * F - Ферзь
 * L - Ладья
 * S - Слон
 * K - Конь
 * для пешки в начале буквы пожалели
 */
public class CommandValidator {
    public boolean validate(String line){
        return line.matches("^[LBSKF]?[a-h][1-8]-[LBSKF]?[a-h][1-8]$");
    }
}
