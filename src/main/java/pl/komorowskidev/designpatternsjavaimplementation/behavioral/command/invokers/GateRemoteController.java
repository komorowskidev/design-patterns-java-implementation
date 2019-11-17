package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.Command;

public class GateRemoteController {

    private Command open;

    private Command close;

    public GateRemoteController(Command open, Command close) {
        this.open = open;
        this.close = close;
    }

    public void openButton(){
        open.execute();
    }

    public void closeButton(){
        close.execute();
    }
}
