package pwo.lab09.factory;

public class Friday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Byle do wieczora.";
    }

    @Override
    public String createMainMessage() {
        return "Trwa ostatni dzień pracy.";
    }

    @Override
    public String createClosingMessage() {
        return "Piątek, piąteczek, piątunio.";
    }
}
