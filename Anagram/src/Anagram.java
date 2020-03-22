import java.lang.reflect.Array;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String str1, String str2)
	{
		char w1[] = str1.replaceAll("[\s]", "").toCharArray();
		char w2[] = str2.replaceAll("[\s]", "").toCharArray();
		Array.sort(w1);
		Array.sort(w2);
		return Array.equals(w1, w2);
		
	}
	public static void main(String[] args) {
		String str1, str2;
		boolean check;
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the first String");
		str1 = sc.nextLine();
		System.out.println("Enter the second string");
		str2 = sc.nextLine();
		check = isAnagram(str1, str2);
		if (check == true)
		{
			System.out.println("the entered strings"+str1+" "+str2+" are anagram");
		}
		else
		{
			System.out.println("The entered string are not anagram");
		}
	}
}
