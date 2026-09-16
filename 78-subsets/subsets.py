class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        ans=[]
        n=len(nums)
        for i in range(1<<n):
            result=[nums[j] for j in range(n) if(i & (1<<j))]
            ans.append(result)
        return ans