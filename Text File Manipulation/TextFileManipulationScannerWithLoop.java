import java.io.File;
import java.util.Scanner;
public class TextFileManipulationScannerWithLoop
{
	public static void main(String[] ards) throws Exception
	{
	File file = new File("Avellana.txt");
	Scanner sc = new Scanner(file);
	
	while (sc.hasNextLine())
		System.out.println(sc.nextLine());
	}
}
