import java.util.List;

public class Main {
    public static void main(String[] args) {
        Team tim = new Team();

        // Dodavanje igraca u tim
        tim.addPlayer(new Player("GK",89,60));
        tim.addPlayer(new Player("GK",86,60));
        tim.addPlayer(new Player("DEF",91,60));
        tim.addPlayer(new Player("DEF",89,60));
        tim.addPlayer(new Player("DEF",89,60));
        tim.addPlayer(new Player("DEF",35,60));
        tim.addPlayer(new Player("DEF",89,60));
        tim.addPlayer(new Player("DEF",80,60));
        tim.addPlayer(new Player("MID",47,60));
        tim.addPlayer(new Player("MID",44,60));
        tim.addPlayer(new Player("MID",33,60));
        tim.addPlayer(new Player("MID",90,60));
        tim.addPlayer(new Player("MID",85,60));
        tim.addPlayer(new Player("MID",80,60));
        tim.addPlayer(new Player("MID",75,60));
        tim.addPlayer(new Player("MID",65,60));
        tim.addPlayer(new Player("MID",55,60));
        tim.addPlayer(new Player("MID",45,60));
        tim.addPlayer(new Player("FWD",70,70));
        tim.addPlayer(new Player("FWD",70,30));
        tim.addPlayer(new Player("FWD",80,40));
        tim.addPlayer(new Player("FWD",50,90));

        // Ako su oba golmana povredjena, odnosno imamo nedovoljno igraca za trazenu formaciju bacamo exception
        try {
            List<Player> teamDefence = tim.stongOpponent();
            List<Player> teamEqual = tim.equalOpponent();
            List<Player> teamAttack = tim.weakOpponent();
            System.out.println("Tim protiv jakog" + teamDefence);
            System.out.println("Tim protiv istog" + teamEqual);
            System.out.println("Tim protiv slabog " + teamAttack);
            int gk=0;
            int def =0;
            int mid = 0;
            int fwd=0;
            for(int i=0;i<tim.getPlayers().size();i++){
                if(tim.getPlayers().get(i).getPosition().equalsIgnoreCase("GK")){
                    gk++;
                }
                if(tim.getPlayers().get(i).getPosition().equalsIgnoreCase("DEF")){
                    def++;
                }
                if(tim.getPlayers().get(i).getPosition().equalsIgnoreCase("MID")){
                    mid++;
                }
                if(tim.getPlayers().get(i).getPosition().equalsIgnoreCase("FWD")){
                    fwd++;
                }

            }
            System.out.println("\nIgraci koji nisu povredjeni:\n");
            System.out.println( gk + " golmana " + def + " odbrambenih " + mid + " veznih " + fwd + " napadaca");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
