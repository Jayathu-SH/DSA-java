

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String word = "Learn Automation in Sinhala";
        String[] words = word.split(" ");
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i];
            if (i != 0) {
                rev += " ";
            }
        }

        System.out.println(rev);
    }
}
