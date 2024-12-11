// BruteForce

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        int[] result = {0,0};
        return result;
    }
}

// HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            int a = nums[i];
            int more = target - a;
            if((mpp.containsKey(more)) && ((more+a)==target))
            {
                int[] res = {mpp.get(more),i};
                return res;
            }
            mpp.put(a,i);
        }
        int[] res = {0,0};
        return res;
    }
}
