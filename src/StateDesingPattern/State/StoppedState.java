package StateDesingPattern.State;

import StateDesingPattern.Context.AudioPlayer;

public class StoppedState implements  State{

    @Override
    public void pressPlay(AudioPlayer player) {
          System.out.println("playing song from Stopped state");
          player.setState(new PlayingState());
    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("song is already in stopped state");

    }
}
