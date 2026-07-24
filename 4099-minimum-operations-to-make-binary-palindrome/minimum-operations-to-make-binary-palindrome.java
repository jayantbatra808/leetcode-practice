class Solution {
    public boolean isCheck(int n){
        String str=Integer.toBinaryString(n);
        int i=0; int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int[] minOperations(int[] nums){
        int n=nums.length;
        int res[] = new int[n];
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1; i<=5000;i++){
            if(isCheck(i)){
                ans.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<ans.size();j++){
                min=Math.min(min,Math.abs(ans.get(j)-nums[i]));
            }
            res[i]=min;
        }
        return res;
    }

}