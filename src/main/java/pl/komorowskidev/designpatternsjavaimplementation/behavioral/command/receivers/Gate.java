package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers;

public class Gate {

    public void open(){
        System.out.println("Gate opened");
    }

    public void close(){
        System.out.println("Gate closed");
    }
}
