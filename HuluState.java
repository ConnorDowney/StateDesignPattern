public class HuluState implements State{
    private String[] shows = {"Better Call Saul", "Gossip Girl", "Friday Night Lights", "Fargo", "La Casa De Papel"};
    private String[] movies = {"Casablanca", "The Shining", "Toy Story", "Toy Story 2", "Toy Story 3"};

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(int i=0;i<movies.length;i++) {
            System.out.println("- "+movies[i]);
        }
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        for(int i=0;i<shows.length;i++) {
            System.out.println("- "+shows[i]);
        }
        System.out.println();
    }
}
