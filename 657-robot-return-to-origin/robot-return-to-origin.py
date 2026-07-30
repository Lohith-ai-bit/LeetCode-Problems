class Solution:
    def judgeCircle(self, moves: str) -> bool:
        up=0
        down=0
        left=0
        right=0
        for i in range(len(moves)):
            if moves[i]=="U":
                up+=1
            if moves[i]=="D":
                down+=1
            if moves[i]=="L":
                left+=1
            if moves[i]=="R":
                right+=1
        return up==down and left==right