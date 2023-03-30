public class stringconcatination {
    public static void main(String[] args){
        String s1 = new String("Program ");
        String s2 = "Construction";
        //String s3 = s1+s2;
        // the above line is equal to the line below.
        String s3 = new
                StringBuilder(String.valueOf(s1)).append(s2).toString();
        System.out.println(s3);

    }
}