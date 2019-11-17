package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers;

public class HeatingSystem {

    public void on(){
        System.out.println("Heating system on");
    }

    public void off(){
        System.out.println("Heating system off");
    }

    public void setTemperature(int requestedTemperatureCelsius){
        System.out.println("Heating system set to temperature: " + requestedTemperatureCelsius + "°C");
    }
}
