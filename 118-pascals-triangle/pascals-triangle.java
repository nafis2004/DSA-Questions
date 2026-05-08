class Solution {

    public List<Integer> generateRows(int row){
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int col = 1; col < row; col++){
            ans = ans*(row-col);
            ans = ans/(col);
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();
          for(int i = 1; i <=numRows; i++){
            ansList.add(generateRows(i));
          }
         return ansList;
    }
}