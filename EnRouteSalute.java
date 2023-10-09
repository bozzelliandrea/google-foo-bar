class EnRouteSalute {
  public static void main(String[] args) {
    System.out.println(solution(">----<")); // 2
    System.out.println(solution("<<>><")); // 4
    System.out.println(solution("--->-><-><-->-")); // 10
  }
  // constraint s.length >= 1 && <= 100
  // TC O(n) where N is the size of S
  // SC O(1) no extra space needed
  public static String solution(String x) {
  
      if(s.equals("-")) // we know s will be at least 1, so i just skip null check
            return 0;

      int left = 0;
      int right = 0;

      for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) == '<')
              left+=right;
          else if (s.charAt(i) == '>')
              right++;
      }

      return left * 2;

  }
}
