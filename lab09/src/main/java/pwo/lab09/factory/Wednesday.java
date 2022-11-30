package pwo.lab09.factory;

public class Wednesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Zaczyna się środa.";
    }

    @Override
    public String createMainMessage() {
        return "W środę praca trwa długo.";
    }

    @Override
    public String createClosingMessage() {
        return "Połowa tygodnia za nami.";
    }
}