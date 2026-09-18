class Solution:
    def numberOfBeams(self, bank: list[str]) -> int:
        total=0
        prevcount=0
        for i in range(len(bank)):
            currcount=bank[i].count('1')
            if(currcount==0):
                continue
            total+=(prevcount*currcount)
            prevcount=currcount
            
        return total