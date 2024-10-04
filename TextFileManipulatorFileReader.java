import java.io.File;
import java.util.Scanner;
public class TextFileManipulatorFileReader
{
	public static void main(String[] ards) throws Exception
	{

	File file = new File("D:\SchoolWork\ITE106(Dean)\MidtermITE106\Avellana.txt");
	Scanner sc = new Scanner(file);
	
	while (sc.hasNextLine())
		System.out.println(sc.nextLine());
	}
}
