
public class NumberCheck {

    public String checkNumber(int num) {

        if (num > 0) {
            return "Positive Number";
        }
        else if (num < 0) {
            return "Negative Number";
        }
        else {
            return "Zero";
        }
    }

    public static void main(String[] args) {

        NumberCheck obj = new NumberCheck();

        System.out.println(obj.checkNumber(10));
        System.out.println(obj.checkNumber(-5));
        System.out.println(obj.checkNumber(0));
    }
}
