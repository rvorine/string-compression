public class StringCompression {
    public static String compress(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        String sample = args.length > 0 ? args[0] : "aabcccccaaa";
        System.out.println(compress(sample));
    }
}
