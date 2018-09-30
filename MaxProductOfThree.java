import java.util.*;

class MaxProductOfThree {

  public int solution(int[] A) {
    if (A.length == 3) {
      return A[0] * A[1] * A[2];
    }
    Arrays.sort(A);

    if (A[0] >= 0 || A[A.length - 1] <= 0) {
      return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
    }
    return Math.max(
        (A[0] * A[1] * A[A.length - 1]), A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);
  }
}
