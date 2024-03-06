public class knnnkl {
    public static void main(String[] args) {

        float marsGravity = 0.38f;
        float earthWeight = 75.0f;
        float marsWeight = 0.0f;
        double marsWeightDouble = 0.0;
        double marsWeightDoubleRounded = 0.0;
        int marsWeightInt = 0;
        char marsWeightChar = '\0';
        int result = 0;


            marsWeight = earthWeight * marsGravity;
            System.out.println("Calculated weight on Mars: " + marsWeight);

            marsWeightDouble = marsWeight;
            System.out.println("Assigned result to a new variable of double type: " + marsWeightDouble);


            marsWeightDoubleRounded = Math.round(marsWeightDouble * 10000.0) / 10000.0;
            System.out.println("Rounded the double variable to 4 decimal places: " + marsWeightDoubleRounded);


            marsWeightInt = (int) marsWeightDoubleRounded;
            System.out.println("Casted double variable to int type: " + marsWeightInt);


            marsWeightChar = (char) marsWeightInt;
            System.out.println("Casted int variable to char type: " + marsWeightChar);

            result = (int) (marsWeightChar) + 1;
        }}



