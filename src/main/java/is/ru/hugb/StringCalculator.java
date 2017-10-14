package is.ru.hugb;


public class StringCalculator {

  public static int toInt(String text) {
        return Integer.parseInt(text);
  }

  public static int Add(String text){
    int sum = 0;

    text = text.replace("\n", ",");
    if (text == "") {
      return 0;
    }
    if (text.contains(",")) {
      String[] splitText = text.split(",");
      for (String n : splitText) {
          sum += toInt(n);
      }
    }
    else {
      sum = toInt(text);
    }

    return sum;
  }

}
