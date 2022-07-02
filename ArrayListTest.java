import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest{
	public static void main(String arg[])
	{
		//ArrayList<String> palindromes = new ArrayList<String>(); // (1)
		//ArrayList<String> palindromes1 = new ArrayList<>(); // (1)Java 7 conversion Diamond Operator
		//ArrayList<Integer> intList = new ArrayList<>(); // (1) ArrayList of Integer
						   //intList.add(10); 
						   //intList.add(100); 
						   //intList.add(1000);
		//ArrayList<String> newList1 = new ArrayList<String>(intList); // (2) Unchecked conversion warning
		//System.out.println(intList.get(0)); // (3)ClassCastException!
		//ArrayList<String> newList2 = new ArrayList<>(intList); // (4) Compile-time error!
		//List<String> palindromes = new ArrayList<>(); // (2) List reference

		//List<String> palindromes = new LinkedList<>(); // Changing implementation.
		//List<String> palindromes = new ArrayList<>(20); // Initial capacity is 20.
			//		palindromes.add("level"); 
			//		palindromes.add("Ada"); 
			//		palindromes.add("kayak");
		//System.out.println(palindromes);
		//List<String> wordList = new ArrayList<>(palindromes);
		//System.out.println(wordList); // [level, Ada, kayak]
		//			wordList.add("Naan");
		//System.out.println(wordList); // [level, Ada, kayak, Naan]
		List<StringBuilder> synonyms = new ArrayList<>(); // List of StringBuilder
		List<Integer> attendance = new ArrayList<>(); // List of Integer
		List<List<String>> listOfLists = new ArrayList<>(); // (3) List of List of String
		List<Integer> frequencies = new ArrayList<>(); // (4) Compile-time error!
		//List<int> frequencies1 = new ArrayList<>(); // (4) Compile-time error!

		Object[] objArray = new String[10]; // (5) OK!

		objArray[2] = "Green"; // (6) OK!
		objArray[1] = new Integer(2016); // ArrayStoreException at Runtime

		System.out.println(objArray);
		//ArrayList<Object> objList1 = new ArrayList<String>();// (7) Compile-time error!
		//List<Object> objList2 = new ArrayList<String>(); // (8) Compile-time error!
System.out.println("\n(2) Add elements to list:");
for (String str : wordArray) {
strList.add(str);
printListWithIndex(strList);
}

		
		
	}
}
	