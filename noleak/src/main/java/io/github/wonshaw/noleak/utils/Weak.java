package io.github.wonshaw.noleak.utils;

import android.content.DialogInterface;

import io.github.wonshaw.noleak.utils.weakproxy.WeakOnCancelListener;
import io.github.wonshaw.noleak.utils.weakproxy.WeakOnDismissListener;
import io.github.wonshaw.noleak.utils.weakproxy.WeakOnShowListener;

public class Weak {
    public static WeakOnCancelListener proxy(DialogInterface.OnCancelListener real) {
        return new WeakOnCancelListener(real);
    }

    public static WeakOnDismissListener proxy(DialogInterface.OnDismissListener real) {
        return new WeakOnDismissListener(real);
    }

    public static WeakOnShowListener proxy(DialogInterface.OnShowListener real) {
        return new WeakOnShowListener(real);
    }
}
