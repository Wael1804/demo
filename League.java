import java.util.ArrayList;

public class League {
    private int n;
    private String leagueName;
    private ArrayList<Club> clubList;

    public League(int n){
        this.n = n;
        this.clubList = new ArrayList<>();
    }

    public void ajoute(Club c){
        if (clubList.size() <= n){
            this.clubList.add(c);
            c.setLeague(this);
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public ArrayList<Club> getClubList() {
        return clubList;
    }

    public void setClubList(ArrayList<Club> clubList) {
        this.clubList = clubList;
    }
}
