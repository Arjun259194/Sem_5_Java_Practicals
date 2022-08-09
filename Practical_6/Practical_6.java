class NumberToWord{
    char[] number = new char[100];
    String[] numberInWords = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public NumberToWord() {
        this.number = "0".toCharArray(); // default value will be 0
    }

    public void setNumber(int n) {
        this.number = String.valueOf(n).toCharArray();
    }

    public String translate(){
        String translatedNumber = "";
        for (char c : this.number) {
            translatedNumber += numberInWords[Integer.parseInt(String.valueOf(c))] + " ";
        }

        return translatedNumber;
    }
}

public class Practical_6 {
  public static void main(String[] args) {
    NumberToWord obj = new NumberToWord();
    obj.setNumber(986654);
    System.out.println(obj.translate());
  }
}
