class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int p1=0,p2=0;
        while(p1<arr1.length && p2<arr2.length){
            int num1 = Integer.valueOf(arr1[p1]);
            int num2 = Integer.valueOf(arr2[p2]);
            if(num1<num2) return -1;
            else if(num1>num2) return 1;
            else{
                p1++;
                p2++;
            }
        }
        int num1=0, num2=0;
        while(p2<arr2.length){
            num2 = Integer.valueOf(arr2[p2]);
            if(num1<num2) return -1;
            else if(num1>num2) return 1;
            else p2++;
        }
        while(p1<arr1.length){
            num1 = Integer.valueOf(arr1[p1]);
            if(num1<num2) return -1;
            else if(num1>num2) return 1;
            else p1++;
        }
    return 0;
    }
}