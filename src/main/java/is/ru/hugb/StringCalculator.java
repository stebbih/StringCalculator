package is.ru.hugb;


public class StringCalculator {

  public static int toInt(String text) {
        return Integer.parseInt(text);
  }



  public static int Add(String text){
    int sum = 0;
    boolean hasMinus = false;
    int singleNumber = 0;
    String returnMinus = "";

    text = text.replace("\n", ",");
    if (text == "") {
      return 0;
    }
    if (text.contains(",")) {
      String[] splitText = text.split(",");
      for (String n : splitText) {
          singleNumber = toInt(n);
          if (singleNumber < 0) {
              hasMinus = true;
              returnMinus += n + ",";
          }
          if (singleNumber >= 1000) {
                continue;
          }
          sum += singleNumber;
      }
    }
    else {
      sum = toInt(text);
      if (sum < 0) {
        throw new IllegalArgumentException("Negative not allowed " + sum);
      }
    }

    if (hasMinus) {
      String newReturnMinus = returnMinus.substring(0, returnMinus.length() - 1);
      throw new IllegalArgumentException("Negative not allowed " + newReturnMinus);
    }

    return sum;
  }

}
