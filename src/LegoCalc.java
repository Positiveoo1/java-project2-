public class LegoCalc {
    public static void main (String[] args) {
            int amountOfBricks = 60;
            int containerCapacity = 8;

            int fullContainer = amountOfBricks / containerCapacity;
            int remaining = amountOfBricks % containerCapacity;

            int total = (amountOfBricks + containerCapacity -1)  / containerCapacity;

        System.out.println("Total number of Legos " + amountOfBricks);
        System.out.println("Container Capacity " + containerCapacity);
        System.out.println("Total number of full cons " + fullContainer);
        System.out.println("Total numbeber of full and not full cons " + total);
        System.out.println("Remaining (not complete ones) " + remaining);



    }
}
