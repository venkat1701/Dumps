import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.nextLine();
		System.out.println("Enter the word to be Searched");
		String word=sc.next();
		sc.close();
		System.out.println("The Searched Word occurs : "+searchCount(str,word));
	}
	public static int searchCount(String str,String word)
	{
		String[] arr=str.split(" ");
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			String tempWord=arr[i];
			if(tempWord.equals(word))
				count++;
		}
		return count;
	}
}
