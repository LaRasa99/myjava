public class SportsImpl implements Sports {
    private String homeTeam;
    private String visitingTeam;

    @Override
    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        this.visitingTeam = name;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }
}
