package learning;

public class LearnString {
    public static void main(String[] args) {
       String text = "   Selenium is the most popular Automation tool in the market.    " ;
       int length =text.length();
        System.out.println(length);

        String newTxt =text.trim();
        System.out.println(newTxt.equalsIgnoreCase(text));

        System.out.println(newTxt.contains("Selenium"));
         System.out.println(newTxt.charAt(7));

         char chatAT =newTxt.charAt(10);
        System.out.println(chatAT);
        String upper = newTxt.toUpperCase();
        System.out.println(upper);

        //split String, Split() return arrys of Stirng.
        String [] afterSplit = newTxt.split(" ");
        for (String eachstirng : afterSplit) {
            System.out.print(eachstirng);
            break;
        }




    }

}
