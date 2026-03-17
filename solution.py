class Solution:
    def rowAndMaximumOnes(self, mat):
        ret = [0, 0]
        for i in range(len(mat)):
            s = sum(mat[i])
            if s > ret[1]:
                ret[0] = i
                ret[1] = s
        
        return ret
