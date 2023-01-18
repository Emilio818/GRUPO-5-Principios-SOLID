package org.example;

import Fail.SmartwatchImpl_fail;
import Fail.WatchImpl_fail;
import Ok.SmartwatchImpl;
import Ok.WatchImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("** MANERA INCORRECTA **");

        System.out.println("Simple Watch");
        WatchImpl_fail wf = new WatchImpl_fail();
        wf.getTime();
        wf.getEmailNotification();

        System.out.println();

        System.out.println("SmartWatch");
        SmartwatchImpl_fail swf = new SmartwatchImpl_fail();
        swf.getTime();
        swf.getEmailNotification();

        System.out.println("\n\n** MANERA CORRECTA **");

        System.out.println("Simple Watch");
        WatchImpl w = new WatchImpl();
        w.getTime();

        System.out.println();

        System.out.println("SmartWatch");
        SmartwatchImpl sw = new SmartwatchImpl();
        sw.getTime();
        sw.getEmailNotifications();
    }

}