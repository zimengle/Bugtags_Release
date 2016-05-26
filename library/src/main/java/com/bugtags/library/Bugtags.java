//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bugtags.library;

import android.app.Activity;
import android.app.Application;
import android.view.MotionEvent;

public class Bugtags {
    public static final int BTGInvocationEventNone = 0;
    public static final int BTGInvocationEventShake = 1;
    public static final int BTGInvocationEventBubble = 2;
    private static Bugtags INSTANCE;


    private static Bugtags getInstance() {
        return INSTANCE;
    }



    public static void start(String var0, Application var1, int var2) {

    }

    public static void invoke() {


    }

    public static void sendFeedback(String var0) {

    }

    public static void sendException(Throwable var0) {


    }

    public static void log(String var0) {

    }

    public static void setUserData(String var0, String var1) {

    }

    public static void removeUserData(String var0){

    }

    public static void removeAllUserData() {
    }

    public static void setTrackingConsoleLog(boolean var0) {
    }

    public static void setTrackingCrashes(boolean var0) {

    }

    public static void setTrackingUserSteps(boolean var0) {


    }

    public static void setInvocationEvent(int var0) {

    }





    public static void onResume(Activity var0) {


    }

    public static void onPause(Activity var0) {


    }

    public static void onDispatchTouchEvent(Activity var0, MotionEvent var1) {

    }


}
