class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        count=0
        word = "".join(set(word))
        for i in range(len(word)):
            if word[i].isupper():
                if word[i].lower() in word:
                    count+=1
        return count