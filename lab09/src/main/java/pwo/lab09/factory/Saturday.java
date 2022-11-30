package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Nareszcie weekend.";
    }

    @Override
    public String createMainMessage() {
        return "Dziś sobota, trzeba posprzątać.";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec soboty.";
    }
}