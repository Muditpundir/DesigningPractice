package StateDesingPattern.State;

import StateDesingPattern.Context.AudioPlayer;

public class PausedState implements  State{


    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Playing song from paused state");
        player.setState(new PlayingState());

    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("stoping song from paused state");
        player.setState(new StoppedState());

    }
}
