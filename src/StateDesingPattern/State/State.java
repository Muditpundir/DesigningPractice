package StateDesingPattern.State;

import StateDesingPattern.Context.AudioPlayer;

public interface State {

    public void pressPlay(AudioPlayer player);
    public void pressStop(AudioPlayer player);
}
