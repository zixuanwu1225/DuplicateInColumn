public class DuplicateInColumn {
    public static void main(String[] args) {
        int[][] arrays = new int[3][3];
        String[][] things = {{"spices"},{"spices"},{"spices"},{"spices"},{"spices"}};
        arrays[0] = new int[]{1,2,3};
        arrays[1] = new int[]{1,2,3};
        arrays[2] = new int[]{1,2,3};
        Methods m = new Methods(arrays);
        System.out.println(m.duplicate(arrays));

    }
}
