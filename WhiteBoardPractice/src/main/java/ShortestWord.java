public class ShortestWord {
    public static String findShortestWord(String sentence){
        String[] words = sentence.split(" ");
        String shortest = words[0];
        for (int i = 0; i < words.length-1; i++) {
            if(words[i].length()>words[i+1].length()){
                shortest = words[i+1];
            }
        }return shortest;
    }

    public static void main(String[] args) {
        String s = "Hello I am Shu";
        System.out.println(findShortestWord(s));
    }

}
