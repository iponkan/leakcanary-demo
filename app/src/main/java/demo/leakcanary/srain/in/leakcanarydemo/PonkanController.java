package demo.leakcanary.srain.in.leakcanarydemo;

import android.content.Context;

/**
 * 控制器
 */
public class PonkanController {

    private static Ponkan mPonkan;

    public static Ponkan getInstance(Context context) {
        if (mPonkan == null) {
            mPonkan = new Ponkan(context);
        }
        return mPonkan;
    }

}
