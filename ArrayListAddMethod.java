import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAddMethod{
	public static void main(String arg[])
	{
		List<String> wordArray=new ArrayList<>();
		wordArray.add("level");
		wordArray.add("Ada");
		wordArray.add("Java");
		wordArray.add("kayak");
		wordArray.add("Bob");
		wordArray.add("Rotator");
		wordArray.add("Bob");

		System.out.println("\n(Add elements to list wordArray ");
		for (String str: wordArray) {
			printListWithIndex(str);
		}
		
	}
}
	