import java.util.*;

class Dominator {

  public int solution(int[] A) {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      if (!counts.containsKey(A[i])) {
        counts.put(A[i], 1);
      } else {
        counts.put(A[i], counts.get(A[i]) + 1);
      }
      if (counts.get(A[i]) > (A.length / 2)) {
        return i;
      }
    }
    return -1;
  }
}
