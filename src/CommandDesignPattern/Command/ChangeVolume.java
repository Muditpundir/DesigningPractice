package CommandDesignPattern.Command;

import CommandDesignPattern.Reciver.Tv;

public class ChangeVolume implements  Command{
    private final Tv tv;
    int volume;

    public ChangeVolume(Tv tv,int volume) {
        this.tv = tv;
        this.volume=volume;
    }

    @Override
    public void execute() {
        tv.adjustVolume(volume);
    }
}
