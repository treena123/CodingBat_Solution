public class WithoutXSolution{
/*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

 */
    public  static void main(String [] args){
        System.out.println(withoutX("Hxi"))
    }
}
public static String withoutX(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
        if(i ==0 || i == str.length()-1){
        if(str.charAt(i) != 'x'){
        sb.append(str.charAt(i));
        }
        } else{
        sb.append(str.charAt(i));
        }

        }
        return sb.toString();
}
