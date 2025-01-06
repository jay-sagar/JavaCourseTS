package September.Week1.StudyBatch;

public class Avg20to1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 20; i > 0; i--) {
            sum += i;
        }
        float avg = sum /20f;
                ;
        System.out.println(avg);
    }
}
