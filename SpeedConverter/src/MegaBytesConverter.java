public class MegaBytesConverter {
    //write a method called printMegaBytesAndKiloBytes with one param and void
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");

        }
    }
}
