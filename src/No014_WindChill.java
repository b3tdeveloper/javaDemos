/******************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill t v
 *
 *  Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 ******************************************************************************/
public class No014_WindChill {
    public static void main(String[] args){
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v,0.16));
        boolean isNotValid = Math.abs(t) > 50 || v > 120 || v < 3;
        if(!isNotValid) {
            System.out.println("Temperature = " + t);
            System.out.println("Wind speed = " + v);
            System.out.println("Wind chill = " + w);
        }else{
            System.out.println("Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3");
        }
    }
}
