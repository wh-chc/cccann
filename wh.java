package First1;

//import java.awt.print.Printable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class wh {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		PY(hashSet);
		Sh(hashSet);
		

	}
	static void Sh(HashSet<String> hashSet) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("E:\\result.txt"));
		int sum = 1;
		for (Iterator it = hashSet.iterator();it.hasNext();){
			pw.println(it.next());
			sum++;
		}
		pw.close();
		
	}
	static void PY(HashSet<String> hashSet){
		for(int i = 0;;i++){
			if (hashSet.size()==10){
				break;
				
			}
			hashSet.add(chc());
		}
	}
	static String chc(){
		int a = Random();
		char b = Symbol();
		int c = Random();
		String str = a + " " + b + " " + c + " = " + SUAN(a,b,c); 
		return str;
	}
	static int Random(){
		return (int) (1 + Math.random() * (100 - 1 + 1));
	}
	static char Symbol(){
		char symble[] = {'+','-','*','/'};
		return symble[(int) (Math.random() * (4))];
	}
	
	static String SUAN(int a,char b,int c){
		if(b == '+' && a + c < 100){
			return (a + c) + "";
		}
		if(b == '-' && a - c < 100){
			return (a - c) + "";
		}
		if(b == '*' && a * c < 100){
			return (a * c) + "";
		}
		if (b == '/' && a / c < 100){
			DecimalFormat ly = new DecimalFormat("#.00");
			double sum = (double) a/c;
			String e = ly.format(sum);
			if(a<c){
				e = 0 + e;
			}
			return e;
		}
		return c + "";
	}
}
