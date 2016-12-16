package demo.leakcanary.srain.in.leakcanarydemo;

import android.content.Context;

import java.lang.ref.WeakReference;

/**
 * 单例检测内存泄漏
 */
public class Ponkan {

    private static Ponkan mInstance;

    private WeakReference<Context> mContext;

    /**
     * 构造方法
     * @param context 上下文
     */
    public Ponkan(Context context) {
        mContext = new WeakReference<>(context);
    }

    public static Ponkan getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new Ponkan(context);
        }
        return mInstance;
    }
}
