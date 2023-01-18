package Ok;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WatchImpl implements ISimpleWatch{
    @Override
    public void getTime() {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        System.out.println(format.format(new Date()));
    }
}
