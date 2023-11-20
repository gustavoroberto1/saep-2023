package saep;

import Model.Professor;
import View.Login;

public class Saep {
    
    public static Professor professor = null;
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
    
}
