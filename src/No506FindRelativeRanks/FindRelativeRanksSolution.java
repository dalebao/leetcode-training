package No506FindRelativeRanks;

import java.util.Arrays;

public class FindRelativeRanksSolution {

    public String[] findRelativeRanks(int[] score) {
        if (score == null || score.length == 0){
            return new String[0];
        }
        int[] copy = Arrays.copyOf(score,score.length);
        Arrays.sort(copy);
        String[] res = new String[score.length];
        for (int i =0; i< score.length;i++) {
            int rank = score.length - Arrays.binarySearch(copy,score[i]);
            if (rank == 1){
                res[i] = "Gold Medal";
            } else if (rank == 2){
                res[i] = "Silver Medal";
            } else if (rank == 3){
                res[i] = "Bronze Medal";
            }else{
                res[i] = String.valueOf(rank);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
