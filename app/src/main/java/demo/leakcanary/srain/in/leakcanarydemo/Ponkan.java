package demo.leakcanary.srain.in.leakcanarydemo;

import android.content.Context;

/**
 * 单例检测内存泄漏
 */
public class Ponkan {

    private Context mContext;

    /**
     * 构造方法
     * @param context 上下文
     */
    public Ponkan(Context context) {
        mContext = context;
    }
}
