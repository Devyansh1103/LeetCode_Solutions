class Solution {
    public String addBinary(String a, String b) {

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int ptra = a.length()-1;
        int ptrb = b.length()-1;
        int sum = 0;

        while(ptra >= 0 || ptrb >= 0 || carry > 0){
            sum = carry;
            if(ptra >= 0) sum += a.charAt(ptra--)-'0';
            if(ptrb >= 0) sum += b.charAt(ptrb--)-'0';
            sb.append(sum % 2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }
}