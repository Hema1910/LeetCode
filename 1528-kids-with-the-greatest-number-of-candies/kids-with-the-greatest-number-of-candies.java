class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list =new ArrayList<>();
        int maxCandies=Integer.MIN_VALUE;
        for (int candie : candies){
            if(candie>maxCandies){
                maxCandies=candie;
            }
        }
        for(int candie :candies){
            if(candie+extraCandies>=maxCandies){
                 list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}