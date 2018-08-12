class MaxSliceSum {

  public int solution(int[] A) {
    int maxCurrent = -1000000;
    int maxTotal = -1000000;

    for (int i = 0; i < A.length; i++) {
      maxCurrent = Math.max(A[i], maxCurrent + A[i]);
      maxTotal = Math.max(maxTotal, maxCurrent);
    }
    return maxTotal;
  }
}
