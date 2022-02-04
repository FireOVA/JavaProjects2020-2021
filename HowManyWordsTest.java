import java.util.*;

public class HowManyWordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String[] words = {"you can do it", "hello", "I see"};
         Arrays.sort(words, new HowManyWords());
         System.out.println(Arrays.toString(words));
         
	}

}
