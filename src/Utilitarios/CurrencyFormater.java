
package Utilitarios;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 * The type Currency formater.
 */
public class CurrencyFormater {

    /**
     * Currency formater.
     *
     * @param edit the edit
     */
    public void CurrencyFormater(JFormattedTextField edit){
        Locale locale = new Locale("pt", "BR");
        DecimalFormat decimal = new DecimalFormat("#,##0.00",new DecimalFormatSymbols (new Locale ("pt", "BR")));
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        NumberFormatter numFormatter = new NumberFormatter(decimal);
        numFormatter.setFormat(decimal);
        numFormatter.setAllowsInvalid(false);
        DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter);
        edit.setFormatterFactory(dfFactory);
         
         
    }
}
