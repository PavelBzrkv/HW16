import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT = "+7 ($2) $3 $4-$5";
    private static final String NUM_SHORT_FORMAT = " +7 ($1) $2 $3-$4";

    public static void main(String[] args) {
        //todo Numbers
        String phoneNumber = new Scanner(System.in).nextLine();
        phoneNumber = phoneNumber.replaceAll("\\D+ ", "");

        if(phoneNumber.length() == 11) {
            phoneNumber = phoneNumber.replaceAll("(\\d)" + VALID_REGEX, NUM_FORMAT);
            System.out.println(phoneNumber);
        }
        else if (phoneNumber.length() == 10){
            phoneNumber = phoneNumber.replaceAll(VALID_REGEX, NUM_SHORT_FORMAT);
            System.out.println(phoneNumber);
        }
        else {
        System.out.println("Это не номер");
        }

    }
}