import java.util.*;

public class Team {
    private List<Player> players = new ArrayList<>();
    private List<Player> injured = new ArrayList<>();

    public Team() { }

    public void addPlayer(Player p){
        this.players.add(p);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void removePlayer(int index){
        Random rand = new Random();
        Player p = this.players.remove(rand.nextInt(index));
        injured.add(p);
    }

    public List<Player> stongOpponent(){
        List<Player> players2 = new ArrayList<>();
        // trazim igrace sa najboljim quality
        this.players.sort(Comparator.comparingInt(Player::getQuality)
                .reversed());
        int def = 0;
        int mid = 0;
        int gk = 0;
        int fwd = 0;
        for(Player p:this.players){
            if(p.getPosition().equalsIgnoreCase("GK")&& gk < 1) {
                players2.add(p);
                gk++;
            }
            if(p.getPosition().equalsIgnoreCase("DEF") && def<5) {
                players2.add(p);
                def++;
            }
            if(p.getPosition().equalsIgnoreCase("MID")&& mid<4){
                players2.add(p);
                mid++;
            }
        }
        this.players.sort(Comparator.comparingInt(Player::getSpeed).reversed());
        for (Player p:this.players){
            if(p.getPosition().equalsIgnoreCase("FWD")){
                players2.add(p);
                fwd++;
                break;
            }
        }
        if(fwd != 1 || mid != 4 || def!=5 || gk!=1)throw new ArithmeticException("nema dovoljno igraca");

        this.removePlayer(21);
        return players2;
    }

    public List<Player> equalOpponent(){
        List<Player> players2 = new ArrayList<>();
        // trazim najbolje igrace, prvo poredim po quality pa po speed
        this.players.sort(Comparator.comparingInt(Player::getQuality)
                .thenComparing(Player::getSpeed)
                .reversed());
        int def = 0;
        int mid = 0;
        int fwd = 0;
        int gk = 0;
        for(Player p:this.players){
            if(p.getPosition().equalsIgnoreCase("GK")&& gk < 1) {
                players2.add(p);
                gk++;
            }
            if(p.getPosition().equalsIgnoreCase("DEF") && def<4) {
                players2.add(p);
                def++;
            }
            if(p.getPosition().equalsIgnoreCase("MID")&& mid<4){
                players2.add(p);
                mid++;
            }
            if(p.getPosition().equalsIgnoreCase("FWD")&& fwd<2){
                players2.add(p);
                fwd++;
            }

        }

        if(fwd != 2 || mid != 4 || def!=4 || gk!=1)throw new ArithmeticException("nema dovoljno igraca");

        this.removePlayer(20);
        return players2;
    }

    public List<Player> weakOpponent(){
        List<Player> players2 = new ArrayList<>();
        this.players.sort(Comparator.comparingInt(Player::getQuality)
                .reversed());
        int def = 0;
        int mid = 0;
        int fwd = 0;
        int gk = 0;
        for(Player p:this.players){
            if(p.getPosition().equalsIgnoreCase("GK")&& gk < 1) {
                players2.add(p);
                gk++;
            }
            if(p.getPosition().equalsIgnoreCase("DEF") && def<3) {
                players2.add(p);
                def++;
            }
            if(p.getPosition().equalsIgnoreCase("MID")&& mid<4){
                players2.add(p);
                mid++;
            }
            if(p.getPosition().equalsIgnoreCase("FWD")&& fwd<3){
                players2.add(p);
                fwd++;
            }

        }
        if(fwd != 3 || mid != 4 || def!=3 || gk!=1)throw new ArithmeticException("nema dovoljno igraca");
        this.removePlayer(19);
        return players2;
    }

}


