import java.util.ArrayList;
import java.util.List;

interface Player{
    void createTeam();
}

class Warrior implements Player{
    public void createTeam(){
        System.out.println("warrior is here");
    }
}

class Mage implements Player{
    public void createTeam() {
        System.out.println("mage is here");
    }
}

class Team{
   private List<Player> myList = new ArrayList<>();
   void addPlayer(Player player){
       myList.add(player);
   }

   public void removePlayer(Player player){
       myList.remove(player);
   }

   void findTeam(){
        System.out.println("find team");

        for (Player pl: myList)
        {
            pl.createTeam();
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Team team = new Team();
        Player pl1 = new Warrior();
        Player pl2 = new Warrior();
        Player pl3 = new Mage();
        Player pl4 = new Mage();

        team.addPlayer(pl1);
        team.addPlayer(pl2);
        team.addPlayer(pl3);
        team.addPlayer(pl4);

        team.findTeam();

        System.out.println();
    }
}
