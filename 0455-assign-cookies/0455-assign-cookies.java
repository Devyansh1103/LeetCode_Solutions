class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0;
        int r = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while((l < s.length) && (r < g.length)){
            if(s[l] >= g[r]) r++;
            l++;
        }
        return r;
    }
}