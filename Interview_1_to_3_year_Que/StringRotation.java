public class StringRotation {

    // String  s1= ABCD    String s2= CDBA  check one string is rotation of another

    String  s1= "ABCD";    String s2= "CDAB";
    public static boolean areRotations(String s1, String s2){
        // length must match
        if(s1.length() != s2.length()){
            return false;
        }

        // Concatenate s1 with itself
        String doubled = s1 + s1;       // ABCDABCD

        // check if s2 is substring
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(areRotations("ABCD", "CDAB"));
        System.out.println(areRotations("ABCD", "ACBD"));
        System.out.println(areRotations("ABCD", "BDBA"));
    }

}
