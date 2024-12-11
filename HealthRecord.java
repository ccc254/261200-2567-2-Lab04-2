public class HealthRecord{
    private int height;
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;
    private static int tallestHeight = DEFAULT_HEIGHT;
    private static int shortestHeight = DEFAULT_HEIGHT ;
    // TODO : HOMEWORK
    private static int counter = 1;

    private static double averageHeight = 0;
    //
    public HealthRecord(int height) {
        setHeight(height);
        counter++;
    }
    public void setHeight(int height) {
        if ( height > MIN_PERMITTED_HEIGHT  && height < MAX_PERMITTED_HEIGHT )
            this.height = height;
        else
            this.height = DEFAULT_HEIGHT;
        //
        if ( this.height > tallestHeight )
            tallestHeight = this.height ;
        if ( this.height < shortestHeight )
            shortestHeight = this.height ;
        if ( height > MIN_PERMITTED_HEIGHT  && height < MAX_PERMITTED_HEIGHT )
            averageHeight = ( averageHeight*(counter-1) + height)/counter;
        else averageHeight = ( averageHeight*(counter-1) + DEFAULT_HEIGHT)/counter;
    }


    public int getHeight() {
        return this.height;
    }
    // TODO : HOMEWORK
    public static double getAverageHeight() {
        return averageHeight;
    }
    //
    public static int getTallestHeight() {
        //return HealthRecord.tallestHeight;
        return tallestHeight;
    }
    public static int getShortestHeight() {
        //return HealthRecord.shortestHeight;
        return shortestHeight;
    }
    public void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
    }
    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("The average height (cm): " + getAverageHeight());
    }


}

