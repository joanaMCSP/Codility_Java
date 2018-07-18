import java.util.*;

class MaxProfit {

  public int solution(int[] A) {
    if (A.length == 0) {
      return 0;
    }
    int min = A[0];
    int globalMax = 0;

    for (int i = 1; i < A.length; i++) {
      min = Math.min(min, A[i]);
      globalMax = Math.max(A[i] - min, globalMax);
    }
    return globalMax;
  }
}
