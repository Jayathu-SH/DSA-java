

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String word = "Learn Automation in Sinhala";
        String[] words = word.split(" ");// split-> "Learn Automation in Sinhala".split(" ") creates an array: ["Learn", "Automation", "in", "Sinhala"].
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
