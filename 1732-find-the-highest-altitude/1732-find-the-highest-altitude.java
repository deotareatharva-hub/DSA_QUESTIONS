class Solution {
    public int largestAltitude(int[] gain) {
        
        ArrayList<Integer> list =new ArrayList<Integer>();
        int alt=0;
        list.add(alt);
        for(int i=0;i<gain.length;i++)
        {
            alt+=gain[i];
            list.add(alt);
        }

        int max=list.get(0);

        for(int i:list)
        {
            if(i>max)
            
            {
                max=i;
            }
        }

        return max;
        
    }
}