public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void drink10() {
        this.volume = volume-10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fillUp() {
        this.volume = 100;
    }
}
