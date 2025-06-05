class Solution {
    public String smallestEquivalentString(String s1, String s2, String sb) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] cb = sb.toCharArray();
        
        char[] p = new char[128];
        for(char i='a'; i<='z'; i++)p[i]=i;

        char p1,p2;
        for(int i=0; i<c1.length; i++){
            p1=getPar(c1[i], p);
            p2=getPar(c2[i], p);
            if(p1!=p2){
                if(p1<p2)p[p2]=p1;
                else p[p1]=p2;
            }
        }
        for(int i=0; i<cb.length; i++)cb[i]=getPar(cb[i], p);
        return new String(cb);
    }
    private char getPar(char c, char[] p){
        if(p[c]==c)return c;
        return p[c]=getPar(p[c], p);
    }
}