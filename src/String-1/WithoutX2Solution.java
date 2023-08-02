public class WithoutX2Solution {

    /*
     * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */
    public static void main(String[] args) {
        System.out.println(withoutX2("Hxi"))
    }

    public static String withoutX2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length(); i++){
            if(i ==0 || i ==1){
                if (str.charAt(i) != 'x'){
                    sb.append(str.charAt(i));
                }
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    }