package while_do_while_string;

public class Task_5 {
    public static void main(String[] args) {
        String str="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        System.out.printf("Transaction ID: "+str);
    }
}
