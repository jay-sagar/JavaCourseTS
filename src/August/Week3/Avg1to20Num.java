package August.Week3;

public class Avg1to20Num {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }

        float avg = sum/2f;
        System.out.println(avg);
    }
}
