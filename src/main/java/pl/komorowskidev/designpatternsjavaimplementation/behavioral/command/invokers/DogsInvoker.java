package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.Command;

public class DogsInvoker {

    private Command dogsReleaseCommand;

    public DogsInvoker(Command dogsReleaseCommand) {
        this.dogsReleaseCommand = dogsReleaseCommand;
    }

    public void release(){
        dogsReleaseCommand.execute();
    }
}
