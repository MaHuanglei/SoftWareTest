package test1_2;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class SomeTool {
	public static void main(String[] args) {
		SomeTool tool = new SomeTool();
		int choice = 0;
		
		while (choice != 5) {
			tool.showMenu();
			choice = tool.getChoice(5);
			tool.distribution(choice);
		}
	}
	
	public void showMenu(){
		System.out.println("1. 字符串连接");
		System.out.println("2. 字符串比较");
		System.out.println("3. 字符串截取");
		System.out.println("4. 字符串组成判断");
		System.out.println("5. 退出");
	}
	
	public int getChoice(int menuNum){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入您的选择：");
		int choice = s.nextInt();
		while(choice > menuNum || choice < 1){
			System.out.print("请重新输入：");
			choice = s.nextInt();
		}
		return choice;
	}
	
	public void distribution(int choice){
		Scanner s = new Scanner(System.in);
		switch (choice) {
		case 1:{
			String str1, str2;
			str1 = s.next();
			str2 = s.next();
			String string = this.strcat(str1, str2);
			System.out.println(string);
			break;
		}
		case 2:{
			String str1, str2;
			str1 = s.next();
			str2 = s.next();
			String res = this.strcompare(str1, str2);
			System.out.println(res);
			break;
		}
		case 3:{
			String str = s.next();
			int begin = s.nextInt();
			int end = s.nextInt();
			String string = this.strsub(str, begin, end);
			System.out.println(string);
			break;
		}
		case 4:{
			String string = s.next();
			String res = this.strJust(string);
			System.out.println(res);
			break;
		}
		default:
			break;
		}
	}
	
	public String strcat(String str1, String str2){
		String string = str1 + str2;
		return string;
	}
	
	public String strcompare(String str1, String str2){
		String res;
		int flag = strcmp(str1, str2);
		if(flag > 0)res = "str1 > str2";
		else if(flag == 0)res = "str1 = str2";
		else res = "str1 < str2";
		return res;
	}
	
	public int strcmp(String str1, String str2){
		return str2.compareTo(str1);
	}
	
	public String strsub(String str1, int begin, int end){
		return str1.substring(begin, end);
	}
	
	public String strJust(String str) {
		boolean flag = this.strJudge(str);
		return flag?"Yes":"No";
	}
	
	public boolean strJudge(String str){
		return StringUtils.isNumeric(str);
	}
}
