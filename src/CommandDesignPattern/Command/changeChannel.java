package CommandDesignPattern.Command;

import CommandDesignPattern.Reciver.Tv;

public class changeChannel implements  Command{

    private final Tv tv;
    int channel;

    public changeChannel(Tv tv,int channel) {
        this.tv = tv;
        this.channel=channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(this.channel);
    }
}
