import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        FileWriter writer = new FileWriter("output.txt")) {

      long n = Long.parseLong(reader.readLine()); // TODO можно переписать на обработку ошибок

      writer.write(String.valueOf(n*n));

      /* Более каноничный метод, соответствующий духу задачи:
       * long n = Long.parseLong(reader.readLine());
       * long base = n / 10; // Убираем последнюю пятёрку
       * long result = base * (base + 1);
       * writer.write((result + "25").replaceFirst("^0+", ""));
       */
    }

    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
