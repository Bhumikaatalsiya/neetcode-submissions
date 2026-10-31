class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childP=0;
        int cookieP=0;

        while(childP<g.length && cookieP<s.length){
            if(s[cookieP]>=g[childP]){
                childP++;
            }
            cookieP++;
        }
        return childP;
    }
}