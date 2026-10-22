class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1 = new ArrayList<>();

        generate(n, n, l1, new StringBuilder());
        return l1;
    }
    public static void generate(int l, int r, List<String> l1, StringBuilder sb){
        if(l == 0 && r == 0){
            l1.add(sb.toString());
            return;
        }

        if(l > 0){
            sb.append('(');
            generate(l - 1, r, l1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(l < r){
            sb.append(')');
            generate(l, r - 1, l1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }
}