package ep3;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jt {
	public static void main(String[] args) throws IOException {
		BufferedReader my_in = new BufferedReader(new InputStreamReader(System.in));
		int ken;
		
System.out.print("10������ �Է��ϼ��� :");
ken = Integer.parseInt(my_in.readLine());
System.out.println("10����:" +ken);
System.out.println("2����: " +Integer.toBinaryString(ken));
System.out.println("8����: " +Integer.toOctalString(ken));
System.out.println("16����: " + Integer.toHexString(ken));
	}
}