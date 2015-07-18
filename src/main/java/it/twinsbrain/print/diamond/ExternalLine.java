package it.twinsbrain.print.diamond;

/**
 * @author angelosciarra
 */
public class ExternalLine extends DiamondLine {
    public ExternalLine(char target, char current) {
        super(target, current);
    }

    @Override
    public String value() {
        return externalSpaces + currentChar + externalSpaces + "\n";
    }

}
