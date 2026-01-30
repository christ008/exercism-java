
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;    
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day = 0; day < this.birdsPerDay.length - 1; day++) {
            if (this.birdsPerDay[day] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int day = 0; day < numberOfDays && day < this.birdsPerDay.length; day++) {
            count += this.birdsPerDay[day];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day = 0; day < this.birdsPerDay.length; day++) {
            if (this.birdsPerDay[day] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
