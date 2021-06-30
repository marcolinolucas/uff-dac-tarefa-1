package calculator;

import java.io.Serializable;

public class CalculatorBean implements Serializable {
     
    private int x;
    private int y; 
    
    public CalculatorBean() {
    }
    
    public int getSum() {
        return x + y;
    }
    
    public void setX(String value) {
        x = Integer.parseInt(value);
    }
    
    public void setY(String value) {
        y = Integer.parseInt(value);
    }
}
