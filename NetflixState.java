public class NetflixState implements State{
    private String[] shows = {"Seinfeld", "The Simpsons", "Game of Thrones", "Breaking Bad", "The Wire"};
    private String[] movies = {"Citizen Kane", "The Dark Knight", "Pulp Fiction", "Alien", "The Godfather"};

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
    }

    public void pressMovieButton() {
        System.out.println("Neflix Movies:");
        for(int i=0;i<movies.length;i++) {
            System.out.println("- "+movies[i]);
        }
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Neflix TV Shows:");
        for(int i=0;i<shows.length;i++) {
            System.out.println("- "+shows[i]);
        }
        System.out.println();
    }
}
