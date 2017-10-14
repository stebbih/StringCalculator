package is.ru.hugb;


public static int toInt(String text) {
      return Integer.parseInt(text);
}

public class StringCalculator {

  public static int Add(String text){
    int sum = 0;
    if (text == "") {
      return 0;
    }
    sum = toInt(text);
    return sum;
  }

}
