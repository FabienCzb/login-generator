package geco;

public class PasswordGenerator {
    public String getRandomPassword(){
        String chars =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String pass = "";
        for(int x = 0; x < 8;x++)
        {
            int i = (int)Math.floor(Math.random() * 62);
            pass += chars.charAt(i);
        }
        System.out.println(pass);
        return pass;
    }
}
