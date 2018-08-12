class TreeHeight {

  public int solution(Tree T) {
    if (T == null) {
      return -1;
    }
    int heightLeft = solution(T.l);
    int heightRight = solution(T.r);
    int height = heightLeft > heightRight ? heightLeft : heightRight;
    return 1 + height;
  }
}
