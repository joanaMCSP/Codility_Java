import java.util.*;

class Distinct {

  public int solution(int[] A) {
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      seen.add(A[i]);
    }
    return seen.size();
  }
}
