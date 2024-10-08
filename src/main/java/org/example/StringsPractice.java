public class StringsPractice {
    public static void main(String[] args) {
        String message = "  Welcome to Java Programming!  ";

        // Trim whitespace
        String trimmedMessage = message.trim();
        System.out.println("Trimmed: " + trimmedMessage);

        // Convert to uppercase
        String upperMessage = trimmedMessage.toUpperCase();
        System.out.println("Uppercase: " + upperMessage);

        // Find the position of a substring
        int position = upperMessage.indexOf("JAVA");
        System.out.println("Position of 'JAVA': " + position);

        // Extract a substring
        String subMessage = trimmedMessage.substring(11, 15);
        System.out.println("Substring: " + subMessage);

        // Replace a word
        String replacedMessage = trimmedMessage.replace("Java", "Python");
        System.out.println("Replaced: " + replacedMessage);
    }
}