public class FirstChar {

    //Capitalize the first alphabets in a string

    public static String capitalizeFirstAlphabet(String sentence){
        String [] arr = sentence.split(" ");
        String output = "";

        for (int i = 0; i < arr.length; i++) {

           output +=   arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ";


        }

        return output;
    }

    public static void main(String[] args) {
        String s = "hello mister how do you do";
        System.out.println(capitalizeFirstAlphabet(s));
    }





}
