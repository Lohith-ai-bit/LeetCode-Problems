class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        count=0
        for i in range(num1,num2+1):
            nums=str(i)
            for j in range(len(nums)-2):
                if (nums[j]<nums[j+1] and nums[j+1]>nums[j+2]) or (nums[j]>nums[j+1] and nums[j+1]<nums[j+2]):
                    count+=1
        return count    