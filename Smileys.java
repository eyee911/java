
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String input) {
        int inputLength = input.length();
        String smiley = ":)";
        if(inputLength%2 == 0){
            int topBottom = (inputLength + 6)/2;
            printTopBottom(topBottom, smiley);
            System.out.println(smiley +" "+ input +" "+smiley);
            printTopBottom(topBottom, smiley);
        }
        else {
            int topBottom = (inputLength + 7)/2;
            printTopBottom(topBottom, smiley);
            System.out.println(smiley +" "+ input +"  "+smiley);
            printTopBottom(topBottom,smiley);
        }
        System.out.println();
    }
    private static void printTopBottom(int inputLength, String smiley){
        for(int i = 0; i < inputLength; i++) {
             System.out.print(smiley);
        }
        System.out.println();
    }
}
