public class Task2 {
    public int solution(int[] A) {
        int maxLength = 0;
        if (A.length < 1) {
            return maxLength;
        }

        int i = 0;
        int curLength = 0;
        int start = 0;
        while (i < A.length) {
            if (i == A[i] || A[i] == -1 || A[i] == start) {

                if (i == A[i] && curLength == 0) {
                    curLength = 1;
                }

                if (A[i] == start) {
                    A[i] = -1;
                    curLength++;
                }

                if (curLength > maxLength) {
                    maxLength = curLength;
                }

                curLength = 0;
                i++;
                start = i;
                continue;
            }

            int current = i;
            i = A[i];
            A[current] = -1;
            curLength++;
        }

        return maxLength;
    }
}
