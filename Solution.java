class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ret = {0, 0};
        for(int i = 0; i < mat.length; i++){
            int s = 0;
            for(int j = 0; j < mat[i].length; j++){
                s += mat[i][j];
            }

            if(s > ret[1]){
                ret[0] = i;
                ret[1] = s;
            }
        }

        return(ret);
    }
}
