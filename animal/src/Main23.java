public class Main23 {
    public static void main(String[] args) {
        SportsImpl sports = new SportsImpl();
        sports.setHomeTeam("Home Team");
        sports.setVisitingTeam("Visiting Team");

        System.out.println("Home team: " + sports.getHomeTeam());
        System.out.println("Visiting team: " + sports.getVisitingTeam());
    }
}
