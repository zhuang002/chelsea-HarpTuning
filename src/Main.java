import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		String harp = null;
		char op=' ';
		int turns;
		int tokenStart = 0;
		int tokenEnd = 0;
		boolean afterOp = false;
		
		for (int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			if (c == '+' || c== '-') {
				tokenEnd = i;
				op = c;
				harp = line.substring(tokenStart, tokenEnd);
				tokenStart = i+1;
				afterOp = true;
			} else if (afterOp && Character.isAlphabetic(c)) {
				tokenEnd = i;
				String sTurns = line.substring(tokenStart, tokenEnd);
				turns = Integer.parseInt(sTurns);
				print(harp, op, turns);
				afterOp = false;
				tokenStart = i;
			}
		}
		turns = Integer.parseInt(line.substring(tokenStart));
		print(harp, op, turns);
		
	}

	private static void print(String harp, char op, int turns) {
		// TODO Auto-generated method stub
		String s="";
		s+=harp+" ";
		if (op == '+')
			s+= "tighten ";
		else 
			s+="loosen ";
		s+= turns;
		
		System.out.println(s);
	}
	
	
	
	

}
