class LoveLanceJanice {
  public static void main(String[] args) {
    System.out.println(solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    System.out.println(solution("wrw blf hvv ozhg mrtsg'h vkrhlwv?"));
  }
  
  public static String solution(String x) {
  
      if(x == null || x.isEmpty())
          return "";
  
      final int lower_case_start = 97;
      final int lower_case_end = 122;
  
      final char[] chars = x.toCharArray();
  
      for(int i = 0; i < chars.length; i++) {
          if(chars[i] >= lower_case_start
                  && chars[i] <= lower_case_end) {
              int diff = ((int) chars[i]) - 97;
              chars[i] = (char) (lower_case_end - diff);
          }
      }
  
      return String.valueOf(chars);
  }
}
