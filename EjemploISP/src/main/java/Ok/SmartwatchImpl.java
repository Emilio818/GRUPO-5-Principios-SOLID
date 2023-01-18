package Ok;

import Ok.ISmartwatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartwatchImpl implements ISmartwatch {
    @Override
    public void getTime() {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        System.out.println(format.format(new Date()));
    }

    @Override
    public void getEmailNotifications() {
        System.out.println("Tienes 2 correos.");
    }
}
