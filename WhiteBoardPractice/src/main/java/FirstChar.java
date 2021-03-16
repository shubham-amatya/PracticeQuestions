public class FirstChar {

    //Capitalize the first alphabets in a string

    public static String capitalizeFirstAlphabet(String sentence){
        String [] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(Character.isLowerCase(arr[i].charAt(0))){
                Character.toUpperCase(arr[i].charAt(0));
            }
        }
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i];
        }

        return output;
    }

    public static void main(String[] args) {
        String s = "hello mister how do you do";
        System.out.println();
    }





}
