public class hm_11 {
    public static void main(String[] args) {
        int arr[]={1,2,33,4,55,6,77,8,9,99};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
