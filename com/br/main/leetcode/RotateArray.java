public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
    }
    
    public void rotate(int[] nums, int k) {
        
        for(int l = 0; l < k; l++){
            int[] arrayGuardado = nums.clone();
            for(int i = 0; i < nums.length; i++){
                if(i == 0){
                    nums[i] = arrayGuardado[arrayGuardado.length - 1];
                }else{
                    nums[i] = arrayGuardado[i - 1];
                }
            }
        }
        
    }
}
