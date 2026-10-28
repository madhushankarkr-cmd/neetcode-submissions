class Solution {
    static void func(int[] nums,int i,int target,List<List<Integer>> ans, List<Integer> a){
        if(target == 0){
            ans.add(new ArrayList<>(a));
            return;
        }
        if(i == nums.length){
            return;
        }

        if(nums[i]<=target){
            a.add(nums[i]);
            func(nums,i,target-nums[i],ans,a);
            a.remove(a.size()-1);
        }
        func(nums,i+1,target,ans,a);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,0,target,ans,new ArrayList<>());
        return ans;
        
    }
}
