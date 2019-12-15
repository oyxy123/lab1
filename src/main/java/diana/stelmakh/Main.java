package diana.stelmakh;

public class Main {
    public static void main(String [ ] args) {
        Integer[][] smallMatrix = new Integer[][]{{-1, 2, 44, 76, -102},
                {-122, 0, 23, 111, -1},
                {5, 76, 55, -56, 11},
                {64, 123, 65, 90, -43},
                {69, 6, -23, 54, 75}};

        Matrix matrix = new Matrix();
        matrix.doTheTask(smallMatrix);
    }
}
