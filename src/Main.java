import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		Matcher m = Pattern.compile("[A-Z]+[+-]\\d+").matcher(line);
		while (m.find()) {
			String op = m.group(); 
			String replaced = op.replace("+", " tighten ");
			replaced = replaced.replace("-", " loosen ");
			System.out.println(replaced);
		}
	}
}
