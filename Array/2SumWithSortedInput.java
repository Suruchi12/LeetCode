//Input is a sorted array
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = numbers.length-1;
        int[] result = new int[100];
        while(start < end){
            
            if(numbers[start] + numbers[end] == target){
               
                return new int[] {start+1, end+1};
            }
            
            else if(numbers[start] + numbers[end] < target)
                start++;
            
            else if(numbers[start] + numbers[end] > target)
                end--;
                
        }
        
        return result;
    }
}

-------------------------------------------------------------------------
//Input is a sorted array - practice 2
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i= 0;
        int j= numbers.length-1;
        
        while(i<j) {
            if(numbers[i] + numbers[j] < target) {
                i++;
            }
            else if(numbers[i] + numbers[j] > target) {
                j--;
            }
            else {
                return new int[] {i+1, j+1};
            }
        }
        
        return new int[]{-1, -1};
        
    }
}


---------------------------------------------------------------------------------
//Using Binary Search

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i< numbers.length; i++){
            int position = binarySearch(numbers, i+1, numbers.length-1, target-numbers[i]);
            if(position != -1){
                return new int []{i+1, position+1};
            }
        }
        return new int []{};
    }
    
    public int binarySearch(int [] numbers, int start, int end, int target){
        int mid = 0;
        
        while(start <= end){
            
            mid=(start+end)/2;
            if(numbers[mid]== target){
                return mid;
            }
            else if(numbers[mid]< target){
                start= mid+1;
            }
            
            else if(numbers[mid] > target){
                end = mid-1;
            }
        }
        return -1;
    }
    
}