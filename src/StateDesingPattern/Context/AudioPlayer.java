package StateDesingPattern.Context;

import StateDesingPattern.State.State;
import StateDesingPattern.State.StoppedState;

public class AudioPlayer {
    public State state;

    public AudioPlayer(){
        this.state=new StoppedState();
    }

    public void setState(State state){
        this.state=state;
    }
    public void pressPlay(){
        state.pressPlay(this);
    }
    public void pressStop(){
       state.pressStop(this);
    }


}
