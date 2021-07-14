package ep3;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String name;
        int age;
             
        System.out.println("나이를 입력하세요.");
        age = scan.nextInt();
        System.out.println("이름을 입력하세요.");
        name = scan.next();
 
        System.out.printf("나이는 %d입니다.%n",age);
        System.out.printf("이름은 %s입니다.%n",name);

 scan.close();

    }
 
}
