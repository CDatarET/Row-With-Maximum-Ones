public class Solution {
    public int[] RowAndMaximumOnes(int[][] mat) {
        int[] ret = {0, 0};
        for(int i = 0; i < mat.Length; i++){
            int s = 0;
            for(int j = 0; j < mat[i].Length; j++) s += mat[i][j];

            if(s > ret[1]){
                ret[0] = i;
                ret[1] = s;
            }
        }
        return(ret);
    }
}
