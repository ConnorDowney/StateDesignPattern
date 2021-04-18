public class HomeState implements State {

    public void pressHomeButton() {
        System.out.println("TV is already on the home screen \n");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix..., and change state\n");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu..., and change state\n");
    }

    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.\n");
    }

    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.\n");
    }
}
