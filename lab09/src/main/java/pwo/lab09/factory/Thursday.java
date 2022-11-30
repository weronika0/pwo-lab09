package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "W czwartek praca trwa krótko.";
    }

    @Override
    public String createClosingMessage() {
        return "Czwartek za nami.";
    }
}