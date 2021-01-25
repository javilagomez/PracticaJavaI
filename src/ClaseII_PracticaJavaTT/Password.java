package ClaseII_PracticaJavaTT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    Pattern pass = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$");

    public void setPass(Pattern pwd) {
        this.pass = pwd;
    }

    public Password(){};

    public Password(Pattern value){
        setPass(value);
    }

    public void setValue(String pwd) {
        Matcher match = pass.matcher(pwd);
        if (match.matches()){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }
    }
}
