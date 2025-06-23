public class SuperheroRoster {
    public static void main(String[] args) {

        Superhero[] heroes = {
            new Superhero("Spider-Man", "Web-slinging", 85),
            new Superhero("Iron Man", "Flying and high-tech armor", 90),
            new Superhero("Black Widow", "Stealth and combat", 80)
        };


        System.out.println("=== Superhero Roster ===");
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }


        System.out.println("=== Search Results ===");
        searchHero(heroes, "Spider-Man");


        double average = calculateAveragePower(heroes);
        System.out.println("\nAverage Power Level: " + average);
    }

    public static void searchHero(Superhero[] heroes, String target) {
        boolean found = false;
        for (Superhero hero : heroes) {
            if (hero.getName().equalsIgnoreCase(target)) {
                System.out.println("Hero found!");
                hero.displayHero();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    public static double calculateAveragePower(Superhero[] heroes) {
        int total = 0;
        for (Superhero hero : heroes) {
            total += hero.getPowerLevel();
        }
        return (double) total / heroes.length;
    }
}


