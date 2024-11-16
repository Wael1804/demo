//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Club club = new Club("psg");
            Club club2 = new Club("OM");

            League l = new League(5);
            l.ajoute(club);
            l.ajoute(club2);
            System.out.println(l.getLeagueName());
            l.getClubList().stream().forEach(club1 -> {System.out.println("nom du club: " + club1.getClubName());
            club1.results();}
            );

        }
    }
