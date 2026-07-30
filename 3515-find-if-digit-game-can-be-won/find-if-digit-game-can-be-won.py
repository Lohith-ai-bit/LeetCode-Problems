class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        alice=0
        bob=0
        for i in range(len(nums)):
            if(nums[i]>=10 and nums[i]<=99):
                alice+=nums[i]
            else:
                bob+=nums[i]
        return alice!=bob
        