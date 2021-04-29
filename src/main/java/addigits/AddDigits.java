package addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.length() == 0)
            return -1;

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            try {
                int value = Integer.parseInt(String.valueOf(input.charAt(i)));
                sum += value;
            } catch(Exception ex) {
                continue;
            }
        }

        return sum;
    }
}