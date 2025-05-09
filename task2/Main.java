import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        FileWriter writer = new FileWriter("output.txt")) {

      int n = Integer.parseInt(reader.readLine()); // TODO можно переписать на обработку ошибок

      int sum = 0;
      if (n >= 1) {
        sum = n * (n + 1) / 2; // используем арифметическую прогрессию
      } else {
        sum = (1 + n) * (1 - n + 1) / 2; // используем арифметическую прогрессию
      }

      writer.write(String.valueOf(sum));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
