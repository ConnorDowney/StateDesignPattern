public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV() {
        HomeState = new HomeState();
        NetflixState = new NetflixState();
        HuluState = new HuluState();
        state = HomeState;
    }

    public void pressHomeButton() {
        state.pressHomeButton();
        setState(HomeState);
    }

    public void pressNetflixButton() {
        state.pressNetflixButton();
        setState(NetflixState);
    }

    public void pressHuluButton() {
        state.pressHuluButton();
        setState(HuluState);
    }

    public void pressMovieButton() {
        state.pressMovieButton();
    }

    public void pressTVButton() {
        state.pressTVButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return HomeState;
    }

    public State getNetflixState() {
        return NetflixState;
    }

    public State getHuluState() {
        return HuluState;
    }
}
