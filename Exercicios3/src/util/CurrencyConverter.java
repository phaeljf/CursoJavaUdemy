package util;

public class CurrencyConverter {

    public static double converter(double dollarPrice, double dollarBought){
        return dollarPrice * dollarBought + (dollarPrice * dollarBought) * 0.06 ;
    }


}
