import java.util.Random;


public class randomPasswordGenerator {
    boolean includeNumber , includeLowerCase , includeUppercase ,includeSpecialCharacters;
    public String password (boolean includeNumber , boolean includeLowerCase , boolean includeUppercase , boolean includeSpecialCharacters, int pwdLength){
        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String UpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String Numbers = "1234567890";
        String SpecialCharacters = "!@#$%^&*";
        String randomPassword = "";
        String allowdedChars = "";

        allowdedChars += includeNumber? Numbers : "";
        allowdedChars += includeLowerCase? lowerCase : "";
        allowdedChars += includeUppercase? UpperCase : "";
        allowdedChars += includeSpecialCharacters? SpecialCharacters : "";

        if(pwdLength>15){
            System.out.println("Password length should be under 15");
        }
        Random random = new Random();
        for(int i =0;i<pwdLength;i++){

            int index = random.nextInt(allowdedChars.length());
            String randomChar  = String.valueOf(allowdedChars.charAt(index));
            randomPassword = randomPassword + randomChar;
        }

        return randomPassword;
    }

    public static void main(String[] args) {
        randomPasswordGenerator r1 = new randomPasswordGenerator();
        String randomPwd = r1.password(true, true, true , true ,9);
        System.out.println(randomPwd);
    }
}
