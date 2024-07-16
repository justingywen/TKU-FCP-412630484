public class hm_18 {
    public static void main(String[] args) {
        int[][][] arr = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        
        
        
        for (int z = 0; z < arr.length; z++) {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < arr[z].length; i++) {
                for (int j = 0; j < arr[z][i].length; j++) {
                    sum += arr[z][i][j];
                    count++;
                }
            }
            double average = sum / count;
            System.out.println("層 " + z + " 的平均值為：" + average);
        }
    }
}
    

