public class milesPerHour {
    public static void main(String[] args) {

        printConversion(100.0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result;
        double doubleResult;
        if (kilometersPerHour < 0.0) {
            result = -1L;
            //lol
        }
        else {
            doubleResult = (kilometersPerHour / 1.609);
            //System.out.println(doubleResult);

            result = Math.round(doubleResult);
            //System.out.println(result);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1){
            System.out.println("Invalid Value");
        }
        else{
        System.out.println(kilometersPerHour + " km/h = "
                + milesPerHour +" mi/h");
        }
    }
}
