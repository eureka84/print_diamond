package it.twinsbrain.print.diamond;

/**
 *
 * @author angelo
 */
public class DiamondBuilder {

    public String build(char targetChar) {
        String result = "";
        for (char currentChar= 'A'; currentChar<=targetChar; currentChar++){
            result+= DiamondLine.createFor(targetChar, currentChar).value();
        }
        for (char i = (char)((int)targetChar-1); i>='A'; i--){
            result+= DiamondLine.createFor(targetChar, i).value();
        }
        return result;
    }
}
