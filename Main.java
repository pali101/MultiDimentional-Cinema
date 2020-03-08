import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int seatsInRows = sc.nextInt();
        int[][] matrix = new int[rows][seatsInRows];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < seatsInRows; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int required = sc.nextInt();
        int result = 0;

        for (int i = 0; i < rows; ++i) {
            int count = 0;
            for (int j = 0; j < seatsInRows; ++j) {
                if (matrix[i][j] == 0) {
                    ++count;
                    if (count == required) {
                        result = i + 1;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (result != 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
