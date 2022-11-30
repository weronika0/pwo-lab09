package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Niedziela rano.";
    }

    @Override
    public String createMainMessage() {
        return "Niedzielny odpoczynek trwa.";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec weekendu, jutro znowu do pracy.";
    }
}