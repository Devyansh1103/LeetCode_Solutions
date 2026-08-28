class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int ps[] = new int[n];
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i] = -1;
            }
            else{
                ps[i] = st.peek(); 
            }
            st.push(i);
        }
        st.clear();
        int ns[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i] = n;
            }
            else{
                ns[i] = st.peek(); 
            }
            st.push(i);
        }
        int max = -1;
        for(int i=0;i<n;i++){
            int area = (ns[i] - ps[i] -1) * heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
}