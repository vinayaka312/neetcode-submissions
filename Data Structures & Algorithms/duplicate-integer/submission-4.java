class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int n : nums) 
            if(!result.add(n))
                return true;
        return false;
    }
}