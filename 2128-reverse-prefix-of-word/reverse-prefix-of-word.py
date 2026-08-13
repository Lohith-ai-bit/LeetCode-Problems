class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        index1=word.find(ch)
        dummy=word[:index1+1]
        return dummy[::-1]+word[index1+1:]

        