class Solution {
    static void func(int[] nums,int ind,List<List<Integer>> ans, List<Integer> ds){
        int n = nums.length;
        if(n==ind){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        func(nums,ind+1,ans,ds);
        ds.remove(ds.size()-1);
        func(nums,ind+1,ans,ds);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,0,ans,new ArrayList<>());
        return ans;
    }
}
