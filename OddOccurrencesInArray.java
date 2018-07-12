import java.util.*;

class OddOccurrencesInArray {

  public int solution(int[] A) {
    Set<Integer> seen = new HashSet<>();

    for (int i = 0; i < A.length; i++) {
      if (!seen.contains(A[i])) {
        seen.add(A[i]);
      } else {
        seen.remove(A[i]);
      }
    }
    List<Integer> result = new LinkedList(seen);
    return result.get(0);
  }
}
