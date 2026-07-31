class Solution:
    def minimumPushes(self, word: str) -> int:
        l=len(word)
        k=l//8
        j=l%8
        sum=0
        for i in range(1,k+1):
            sum+=8*i
        for i in range(j):
            sum+=k+1
        return sum

        