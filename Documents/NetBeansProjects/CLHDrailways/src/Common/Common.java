/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author acer
 */
public class Common {
    public static String formatNumber(double number){
        NumberFormat nf = NumberFormat.getNumberInstance();
        return nf.format(number);
        
    }
    
    public static String formatDate(Date date){
        Locale local = new Locale("vi","VN");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", local);
        return df.format(date);
    }
}
