package dcmfc.estudos.algoritmos.bean;

public class ArrayBean {

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double sumNums1 = 0;
        double sumNums2 = 0;
        int i = 0;
        
        if(nums1.length!=0)
        {
            sumNums1 = sumArray(nums1)/nums1.length;
            i++;
        }
        
        if(nums2.length!=0)
        {
            sumNums2 = sumArray(nums2)/nums2.length;
            i++;
        }
        
        return (sumNums1+sumNums2)/i;
    }
    
    private double sumArray(int[] nums)
    {
        double result = 0;
        for(int number : nums)
            result = result + number;
        
        return result;
    }
}
