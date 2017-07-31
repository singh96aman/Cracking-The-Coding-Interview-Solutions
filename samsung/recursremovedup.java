import java.util.*;
class recursremovedup{

  public static void main(String[] args) {

  String input = args[0];
  System.out.println(input + "-" + input.length());

  StringBuffer buffer = new StringBuffer(input);
  removeChar(buffer, 0, input.length());
  System.out.println(buffer.toString() + "-" + buffer.length());
  }

  static void removeChar(StringBuffer str, int start, int length) {
    if (start == length)
      return;
    removeChar(str, start + 1, length);
    if (start > 0 && start != str.length() && str.charAt(start - 1) == str.charAt(start))
      str.delete(start - 1, start + 1);
  }
}
