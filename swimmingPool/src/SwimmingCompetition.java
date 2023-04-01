
class Swimmer {
    private String name;
    private int id;

    public Swimmer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void checkScoreboard() {
        System.out.println(name + " checked the scoreboard.");
    }
}

class Spectator {
    private String name;
    private int id;

    public Spectator(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void checkScoreboard() {
        System.out.println(name + " checked the scoreboard.");
    }
}

class Judge {
    private String name;
    private int id;

    public Judge(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void blowWhistle() {
        System.out.println(name + " blew the whistle.");
    }

    public void checkScoreboard() {
        System.out.println(name + " checked the scoreboard.");
    }
}

class SupportStaff {
    private String name;
    private int id;

    public SupportStaff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void checkScoreboard() {
        System.out.println(name + " checked the scoreboard.");
    }
}

class SwimmingCompetition {
    public static void main(String[] args) {
        // Parsing command-line arguments
        int numSwimmers = Integer.parseInt(args[0]);
        int numSpectators = Integer.parseInt(args[1]);
        int numJudges = Integer.parseInt(args[2]);
        int numSupportStaff = Integer.parseInt(args[3]);

        // Creating swimmers
        for (int i = 1; i <= numSwimmers; i++) {
            Swimmer swimmer = new Swimmer("Swimmer " + i, i);
            swimmer.checkScoreboard();
            swimmer.swim();
        }

        // Creating spectators
        for (int i = 1; i <= numSpectators; i++) {
            Spectator spectator = new Spectator("Spectator " + i, i);
            spectator.checkScoreboard();
        }

        // Creating judges
        for (int i = 1; i <= numJudges; i++) {
            Judge judge = new Judge("Judge " + i, i);
            judge.checkScoreboard();
            judge.blowWhistle();
        }

        // Creating support staff
        for (int i = 1; i <= numSupportStaff; i++) {
            SupportStaff staff = new SupportStaff("Support Staff " + i, i);
            staff.checkScoreboard();
        }
    }
}
