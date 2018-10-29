public class Main {

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        System.out.println(1);
        int[] A = {1, 4, -1, 3, 2};
        System.out.print(main.solution(A));
    }

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
