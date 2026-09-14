public class App {
    public static void main(String[] args) {
        System.out.println("Project is started!!!");
        int[] data = {56, 4, 74, 100, 1, 0, 45, 6, 78, 1, 9, 37, 48, 0, 9, 7, 84, 13}; // a, b === a < b
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}
