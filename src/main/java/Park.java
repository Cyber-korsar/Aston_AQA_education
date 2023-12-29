public class Park {
    static class Attraction {
        String nameAttraction;
        String workingHours;
        double price;

        public Attraction(String nameAttraction, String workingHours, double price) {
            this.nameAttraction = nameAttraction;
            this.workingHours = workingHours;
            this.price = price;
        }

        void park() {
            Park.Attraction[] attractionsArray = new Park.Attraction[5];
            attractionsArray[0] = new Park.Attraction("UFO", "12:00-22:00", 5);
            attractionsArray[1] = new Park.Attraction("Zodiac", "12:00-22:00", 6.5);
            attractionsArray[2] = new Park.Attraction("Gravity", "11:00-20:00", 4.5);
            attractionsArray[3] = new Park.Attraction("Fear", "14:00-22:00", 3);
            attractionsArray[4] = new Park.Attraction("Ferris wheel", "10:00-22:00", 3);
        }
    }
}