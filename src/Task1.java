public class Task1 {
    public int solution(int[] A) {
        int length = 0;

        if (A.length < 1) {
            return length;
        }

        int current = A[0];

        while (current != -1) {
            current = A[current];
            length++;
        }

        return ++length;
    }
}
