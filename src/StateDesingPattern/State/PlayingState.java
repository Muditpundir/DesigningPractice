package StateDesingPattern.State;

import StateDesingPattern.Context.AudioPlayer;

public class PlayingState implements  State{
    @Override
    public void pressPlay(AudioPlayer player) {
      System.out.println("Pausing song from playing stat");
      player.setState(new PausedState());
    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("Stopping song from playing state");
        player.setState(new StoppedState());
    }
}
