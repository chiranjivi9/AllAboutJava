public class ConvertFeetToCentimeter {

    public static void main(String[] args){

        calcFeetAndInchesToCentimeter(7,5);
        calcFeetAndInchesToCentimeter(6,0);
        calcFeetAndInchesToCentimeter(0,-10);
        calcFeetAndInchesToCentimeter(500);

    }


//Method Over Loading.

//    Method accepts feet and inches parameter.

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){

        if((feet>=0) && (inches >=0 && inches <= 12 )){

            double convertedFeetToCm = (feet * 12)* 2.54;
            double convertInchesToCm = (inches*2.54);
            double finalFeetAndInchToCm = convertedFeetToCm + convertInchesToCm;
            System.out.println(feet +"ft and "+ inches+" inches = " + finalFeetAndInchToCm);
            return finalFeetAndInchToCm;
        }
        System.out.println("Invalid feet or inches value.");
        return -1;
    }


//    Method accepts on feet parameter.
//    converts the inches parameter to feet and inches and then returns the centimeters value.

    public static double calcFeetAndInchesToCentimeter(double inches){

        if(inches<0){
            return -1;
        }

        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "ft and " + remainingInches + "in");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }

}
