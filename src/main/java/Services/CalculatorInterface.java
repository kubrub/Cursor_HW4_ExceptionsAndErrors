package Services;

import Exception.MyOwnException;

public interface CalculatorInterface {
    void addition(int num1, int num2) throws MyOwnException;
    void subtraction(int num1, int num2) throws MyOwnException;
    void multiplication(int num1, int num2) throws MyOwnException;
    void division(int num1, int num2) throws MyOwnException;
    //void calculate() throws Exception.MyOwnException;
}
