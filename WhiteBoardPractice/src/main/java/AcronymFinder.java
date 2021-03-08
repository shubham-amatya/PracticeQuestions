public class AcronymFinder {

/**
 * Given a phrase, get the acronym of that phrase. Acronym is the combination of
 * the first character of each word in upper case.
 * For example, given "Ruby on Rails", this method will return "ROR"
 */


public static String findAcronym(String str){

    String []arr = str.split(" ");
    String output = "";

    for (int i = 0; i < arr.length; i++) {
            output += arr[i].charAt(0);

        }
        return output;

    }




public static void main(String[] args) {
    String phrase = "Portable Network Graphics";
    System.out.println(findAcronym(phrase));
}


}
