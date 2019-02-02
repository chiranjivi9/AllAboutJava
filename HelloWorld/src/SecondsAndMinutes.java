public class SecondsAndMinutes {


    public static void main(String[] args){

        System.out.println(getDurationString(135, 65));
        System.out.println(getDurationString(372239));
    }

    private static String getDurationString(long minutes, long seconds){

        if((minutes>=0) || seconds >= 0 || seconds <59 ){
//            XXh YYm ZZs

            long hours = minutes/60;
            long remainingMinutes = minutes % 60;

            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }

        return "Invalid";
    }


    private static String getDurationString(long seconds){

        if(seconds >= 0){

            long calculatedMinutes = seconds / 60;
            long remainingnSeconds = seconds % 60;
            String time = getDurationString(calculatedMinutes, remainingnSeconds);
            return time;

        } else {
            return "Invalid";
        }
    }
}
