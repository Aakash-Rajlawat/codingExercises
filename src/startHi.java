public class startHi
{
    /*Given a string, return true if the string starts with "hi" and false otherwise.


    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false */

    public boolean startHi() {
        String str = "h";
        if(str.length()>1) {
            String forH = String.valueOf(str.charAt(0));
            String forI = String.valueOf(str.charAt(1));

            String checkForHi = forH + forI;

            return checkForHi.equals("hi");
        }
        else {
            return false;
        }

    };

    static void main(String[] args) {
        startHi run = new startHi();
        boolean result = run.startHi();
        System.out.println(result);
    }


}
