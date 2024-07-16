public class hm_16 {
    public static void main(String[] args) {
        int sum=0;
        int[][][]arr={{{1,2},
                       {3,4},
                       {5,6}}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    sum+=arr[i][j][k];
                }
                
            }
            
        } 
        System.out.println(+sum);
}
}
    

