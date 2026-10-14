package CommandDesignPattern.Invoker;

import CommandDesignPattern.Command.Command;

public class Remote {




    public void performAction(Command command){
        command.execute();
    }
}
