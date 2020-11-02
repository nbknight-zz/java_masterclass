public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0 || bigCount < 0 || smallCount < 0) {
            return false;
        }
        return (goal <= bigCount * 5 + smallCount) && (smallCount >= goal % 5);
    }
}