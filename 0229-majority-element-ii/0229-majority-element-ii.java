class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold=nums.length/3;
        Map<Integer,Integer> frequency=new TreeMap<>();
        List<Integer> answer=new ArrayList<>();

        for(int value:nums){
            frequency.put(value,frequency.getOrDefault(value,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:frequency.entrySet()){
            if(entry.getValue()>threshold){
                answer.add(entry.getKey());
            }
            if(answer.size()==2){
                break;
            }
        }
        return answer;
    }
}