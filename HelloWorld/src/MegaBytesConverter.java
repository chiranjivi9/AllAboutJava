public class MegaBytesConverter {

    public static void main(String[] args) {
        int kiloByte = 2050;

        printMegaBytesAndKiloBytes(kiloByte);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(-1);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainderKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKb + " KB");
        }
    }
}
