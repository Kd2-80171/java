
public class CountWord {
	public static void main(String[] args) {
		
		String name = "my name girish venkatrao ugile";
		
		int wordcount = countWords(name);
		System.out.println("number of words=" + wordcount);
	}

	private static int countWords(String name) {
		name = name.trim();
		String [] words = name.split(" ");
		
		return words.length;
	}

}
