import java.io.File
import java.io.FileNotFoundException;
import java.util.Scanner;

  public class TextFileManipulationScannerWithoutLoop
    {
      public static void main(String[] args)
      throws FileNotFoundException
      {
        File file = new("Avellana.txt");
        Scanner sc = new Scanner(file);

      sc.useDelimiter("\\z");

      System.out.println(sc.next());
      }
    }
