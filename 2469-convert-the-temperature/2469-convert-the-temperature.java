class Solution {
    public double[] convertTemperature(double celsius) {
        /*Celsius to Kelvin, K = C + 273.15.
        Celsius to Fahrenheit, F = (9/5)C + 32.*/
        double kelvin,fahrenheit;
        kelvin = celsius + 273.15;
        fahrenheit = 1.8*celsius + 32;
        return new double[] {kelvin,fahrenheit};
    }
}