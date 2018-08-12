import java.util.*;

class EquiLeader {

  public int solution(int[] A) {
    int n = A.length;
    int[] leaders = new int[n];
    int leaderCount = 0;
    int equiCount = 0;

    int leader = getLeader(A);

    if (leader == (int) Math.pow(10, 9) + 1) {
      return 0;
    }

    for (int i = 0; i < n; i++) {
      if (A[i] == leader) {
        leaderCount++;
      }
      leaders[i] = leaderCount;
    }

    for (int i = 0; i < n; i++) {
      if (leaders[i] > (i + 1) / 2 && leaders[n - 1] - leaders[i] > (n - 1 - i) / 2) {
        equiCount++;
      }
    }
    return equiCount;
  }

  private int getLeader(int[] A) {
    Map<Integer, Integer> counts = new HashMap<>();
    int leader = (int) Math.pow(10, 9) + 1;

    for (int i = 0; i < A.length; i++) {
      if (!counts.containsKey(A[i])) {
        counts.put(A[i], 1);
      } else {
        counts.put(A[i], counts.get(A[i]) + 1);
      }
      if (counts.get(A[i]) > (A.length / 2)) {
        leader = A[i];
      }
    }
    return leader;
  }
}
