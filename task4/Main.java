import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
         FileWriter writer = new FileWriter("output.txt")) {

      int n = Integer.parseInt(reader.readLine()); // TODO можно переписать на обработку ошибок

      writer.write("" + n + "9" + (9-n)); // TODO на стрингбилдере не будет жрать память / Формат медленее
    }

    catch (IOException e) {
      e.printStackTrace();
    }
  }
}