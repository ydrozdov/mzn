public class Task3 {
    public int solution(int[] A) {
        int maxSlice = 0;
        int len = A.length;

        if (len < 2) {
            return len;
        }

        for (int i = 0; i < len - 1; i++) {
            int firstNum = A[i], secondNum = A[i + 1];
            int curSlice = 1;

            for (int j = i + 1; j < len; j++) {
                if (A[j] != firstNum && A[j] != secondNum) {
                    if (firstNum == secondNum) {
                        secondNum = A[j];
                        curSlice++;
                        continue;
                    }
                    break;
                }

                curSlice++;
            }

            if (curSlice > maxSlice) {
                maxSlice = curSlice;
            }
        }

        return maxSlice;
    }
}
