package it.twinsbrain.print.diamond;

/**
 *
 * @author angelo
 */
public class DiamondBuilder {

    public String build(char input) {
        String result = "";
        for (char i= 'A'; i<=input; i++){
            result+= DiamondLine.get(input, i).value();
        }
        for (char i = (char)((int)input-1); i>='A'; i--){
            result+= DiamondLine.get(input, i).value();
        }
        return result;
    }
}
