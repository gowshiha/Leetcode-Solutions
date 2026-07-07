class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW = 0;
        for(int i=0;i<accounts.length;i++){
            int currentcW = 0;
            for(int j=0;j<accounts[i].length;j++){
            currentcW += accounts[i][j];
            }
        
            if(currentcW > maxW){
                maxW = currentcW;
            }
        }
        return maxW;
    }
}