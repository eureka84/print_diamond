package it.twinsbrain.print.diamond;

import com.google.common.base.Strings;

/**
 * @author angelosciarra
 */
public abstract class DiamondLine {

    protected final char currentChar;
    protected final String externalSpaces;

    protected DiamondLine(final char target, final char current) {
        currentChar = current;
        externalSpaces = Strings.repeat(" ", target - current);
    }

    public static DiamondLine createFor(final char target, final char current){
        if(current == 'A'){
            return new ExternalLine(target, current);
        } else {
            return new InternalLine(target, current);
        }
    }

    public abstract String value();

}
