public class MissingNumber {
    public static void fineMissingNumber() {
            int[] a = {1,2,3,4,5,6,7,8,9,10};
            int[] nums = {1, 2, 4, 5, 6, 8, 9, 10};
            // code here..
            int numlen=nums.length;
            int alen= a.length;
            for(int i=0,j=0; i<alen && j<numlen; i++,j++)
            {
        
                    if(a[i]!=nums[j])
                    {
                        System.out.println(a[i]);
                        i++;
                    }
                    
            }
    }
        public static void main(String[] args) {
    //        begin here
    //        begin here
    //        begin here
                fineMissingNumber();
        }
    }