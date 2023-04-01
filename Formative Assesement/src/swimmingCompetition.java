class Swimmer{
    private int id;
    private String name;

    public Swimmer(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void swim(){
        System.out.println(name +", with the ID number of "+ id + " is swimming.");
    }
    public void checkTheScoreboard(){
        System.out.println(name + " checked the scoreboard.");
    }
}

class Spectator{
    private int id;
    private String name;

    public Spectator(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void checkTheScoreboard(){
        System.out.println(name + " checked the scoreboard.");
    }
}

class Judge{
    int id;
    private String name;

    public Judge(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void blowTheWhistle(){
        System.out.println(name +", with the ID number of "+ id + " blew the whistle");
    }
    public void checkTheScoreboard(){
        System.out.println(name + " checked the scoreboard.");
    }
}

class supportStaff{
    int id;
    private String name;

    public supportStaff(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void checkTheScoreboard(){
        System.out.println(name + " checked the scoreboard.");
    }
}

public class swimmingCompetition {
    public static void main(String[] args) {
        int noSwimmers = Integer.parseInt(args[0]);
        int noSpectators = Integer.parseInt(args[1]);
        int noJudge = Integer.parseInt(args[2]);
        int noSupportStaff = Integer.parseInt(args[3]);

        for (int i = 1; i <= noSwimmers; i++) {
            Swimmer swimmer = new Swimmer(i, "Swimmer_" + i);
            swimmer.swim();
            swimmer.checkTheScoreboard();
        }
        for (int i = 1; i <= noSpectators; i++) {
            Spectator spectator = new Spectator(i, "Spectator_" + i);
            spectator.checkTheScoreboard();
        }
        for (int i = 1; i <= noJudge; i++) {
            Judge judge = new Judge(i, "Judge_" + i);
            judge.blowTheWhistle();
            judge.checkTheScoreboard();
        }
        for (int i = 1; i <= noSupportStaff; i++) {
            supportStaff supportstaff = new supportStaff(i, "SupportStaff_" + i);
            supportstaff.checkTheScoreboard();
        }
    }
}