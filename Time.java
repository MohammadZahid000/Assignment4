package Assignment4;
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

   
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

   
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    
    public void setTime(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid time: hr must be < 24, min < 60, sec < 60");
        }
    }

    
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
    }

    
    public void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

   
    public static void main(String[] args) {
        try {
            Time time1 = new Time(14, 30, 45);
            Time time2 = new Time(25, 10, 15); 

            time1.display();
            time2.display(); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        
        Time time3 = new Time();
        time3.display(); 
    }
}



