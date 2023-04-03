class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length -1;
        int boat=0;
        int i=0;
        Arrays.sort(people);
        while(i<=n){
            if(people[i]+people[n] <= limit){
                i++;
            }
            n--;
            boat++;
        }
        return boat;
    }
}