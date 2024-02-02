
package controllers;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
    public int inputNum() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }
    
    public double inputDouble() {
        try {
            return Double.parseDouble(sc.nextLine().trim());
        } catch (Exception e) {
            return Double.MAX_VALUE;
        }
    }
    
    
    public String inputString() {
        return sc.nextLine().trim();
    }
    
    public boolean checkPhone(String num) {
        if (num.length() != 10) {
            return false;
        }
        
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
