import java.util.Comparator;

public class HowManyWords implements Comparator<String>{
	
    public int compare(String s, String t) {

        if (s == null && t == null) {

            return 0;
        }
        
        int sWords = s.split(" ").length;
        int tWords = t.split(" ").length;

        if (sWords > tWords) {

            return 1;
            
        } else if (sWords < tWords) {

            return -1;

        } else {

            return 0;
        }
    }
}
