class BunnyWorkerLocations {
  public static void main(String[] args) {
    System.out.println(solution(3, 2));
    System.out.println(solution(5, 10));
    System.out.println(solution(1, 1));
  }
  
  public static String solution(String x) {
  
      long targetLine = x + y - 1;
      long previousMax = 0;

      for(long i = 0; i < targetLine; i++) {
          previousMax+=i;
      }

      return previousMax + x + "";
  }
}
