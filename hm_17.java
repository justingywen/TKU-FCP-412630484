public class hm_17 {

    public static void main(String[] args) {
        int[][][] arr = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k] + " ");  
                }
                System.out.println();
            }
            System.out.println();
        } 
    int newnum=10;
    int x=1,y=0,z=1;
    arr[x][y][z]=newnum;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            for (int k = 0; k < arr[i][j].length; k++) {
                System.out.print(arr[i][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
}
    
