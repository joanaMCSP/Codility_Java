import java.util.*;

class Triangle {

  public int solution(int[] A) {
    if (A == null || A.length < 3) {
      return 0;
    }
    Arrays.sort(A);

    for (int i = 0; i < A.length - 2; i++) {
      int j = i + 1;
      int k = i + 2;
      if (A[i] > 0 && A[i] > A[k] - A[j]) {
        return 1;
      }
    }
    return 0;
  }
}
