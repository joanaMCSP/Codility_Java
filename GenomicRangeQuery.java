import java.util.*;

class GenomicRangeQuery {

  public int[] solution(String S, int[] P, int[] Q) {
    Map<Character, Integer> charWeights = new HashMap<>();
    charWeights.put('A', 1);
    charWeights.put('C', 2);
    charWeights.put('G', 3);
    charWeights.put('T', 4);

    int[][] charCounts = new int[S.length()][4];

    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (i > 0) {
        for (int j = 0; j < charCounts[i].length; j++) {
          charCounts[i][j] = charCounts[i - 1][j];
        }
      }
      charCounts[i][charWeights.get(c) - 1]++;
    }

    int[] results = new int[P.length];

    for (int i = 0; i < P.length; i++) {
      int start = P[i];
      int end = Q[i];

      if (start == end) {
        results[i] = charWeights.get(S.charAt(start));
      } else {
        int[] startPos = charCounts[start];
        int[] endPos = charCounts[end];
        results[i] = Math.min(charWeights.get(S.charAt(start)), charWeights.get(S.charAt(end)));

        for (int j = 0; j < startPos.length; j++) {
          int diff = endPos[j] - startPos[j];
          if (diff > 0 && j + 1 < results[i]) {
            results[i] = j + 1;
            break;
          }
        }
      }
    }
    return results;
  }
}
