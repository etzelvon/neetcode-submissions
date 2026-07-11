class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> dizi = new HashSet<>();
        
        for (int num : nums){
            if(!dizi.add(num)){
                return true;
            }
        }
        return false;
    }
}