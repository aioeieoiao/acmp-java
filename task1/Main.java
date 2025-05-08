import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  private static int parseAndReset(StringBuilder num) {
    int value = Integer.parseInt(num.toString());
    num.setLength(0); // Очищаем StringBuilder
    return value;
  }

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        FileWriter writer = new FileWriter("output.txt")) {

      int sum = 0;
      StringBuilder num = new StringBuilder();
      int ch;

      while ((ch = reader.read()) != -1) {
        if (Character.isDigit(ch)) {
          num.append((char) ch);
        } else if (Character.isWhitespace(ch) && num.length() > 0) {
          sum += parseAndReset(num);
        }
      }

      // Обработка последнего числа
      if (num.length() > 0) {
        sum += parseAndReset(num);
      }

      writer.write(String.valueOf(sum));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
