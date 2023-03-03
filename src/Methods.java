public class Methods {
    private int[][] arrays;
    private int amtOfColumns;
    public Methods(int[][] arrays){
        this.arrays=arrays;
        amtOfColumns=arrays.length;
    }
    public boolean duplicate(int[][] arrays){
        for(int i=0;i<arrays.length;i++){
            int[] checkRow = new int[amtOfColumns];
            for(int j=0;j<arrays.length;j++){
                checkRow[j]=arrays[j][i];
            }
            for(int k=0;k<arrays.length;k++){
                
            }
        }
        return false;
    }
}
