public class SumOfIntegersinString {
    public static void main(String[] args) {
        String input = "JayathuSanka127";
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if(Character.isDigit(character)){
                total = total+ Character.getNumericValue(character);
            }

        }
        System.out.println(total);

    
    }
}
