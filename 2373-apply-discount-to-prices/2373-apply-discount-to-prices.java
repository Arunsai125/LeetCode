class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            if(word.charAt(0)=='$' && word.length()>1 && Character.isDigit(word.charAt(1))){
                StringBuilder sb = new StringBuilder();
                int c=0;
                for(int i=1;i<word.length();i++){
                    if(Character.isDigit(word.charAt(i))) { sb.append(word.charAt(i)); c++;}
                    else break;
                }
                if(c==word.length()-1){
                    double f = Double.valueOf(sb.toString());
                    double val = f * (discount/100.0);
                    f = f-val;
                    ans.append("$");
                    ans.append(String.format("%.2f", f));
                    ans.append(" ");
                }
                else{
                    ans.append(word);
                    ans.append(" ");
                }
            }
            else{
                ans.append(word);
                ans.append(" ");
            }
        }
    return ans.toString().trim();
    }
}