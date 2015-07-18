package it.twinsbrain.print.diamond;

import com.google.common.base.Strings;

/**
 * @author angelosciarra
 */
public class InternalLine extends DiamondLine {

    private final String internalSpaces;

    public InternalLine(char target, char current) {
        super(target, current);
        int currentDistance = current - 'A';
        internalSpaces = Strings.repeat(" ", (currentDistance * 2) -1);
    }

    @Override
    public String value() {
        return externalSpaces + currentChar + internalSpaces + currentChar + externalSpaces + "\n";
    }
}
