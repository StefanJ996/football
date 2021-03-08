public class Player {
    private String position;
    private int quality;
    private int speed;
    public Player(String position, int quality, int speed) {
        this.position = position;
        this.quality = quality;
        this.speed = speed;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "position='" + position + '\'' +
                ", quality=" + quality +
                ", speed=" + speed +
                '}';
    }
}