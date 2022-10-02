package stringdemo;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am a developer and I am also engineer";
        String result = "";
        for(int i = str.length()-1;i>=0;i-- ){
         //  result = result.concat(String.valueOf(str.charAt(i)));

        }
        System.out.println(result);
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);

    }
}

/*public class ReverseString {
    public static void main(String[] args) {

        String str = "I am Developer and also Engineer";

        String[] strings = str.split(" ");

        for (int i= strings.length-1;i>=0;i--){
            System.out.print(strings[i]+ " ");
        }
    }
}*/

