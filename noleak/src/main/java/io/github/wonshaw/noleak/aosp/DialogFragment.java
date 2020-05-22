package io.github.wonshaw.noleak.aosp;

import android.app.Dialog;
import android.os.Bundle;

import io.github.wonshaw.noleak.dialog.WeakDialog;

public class DialogFragment extends android.app.DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new WeakDialog(getActivity(), getTheme());
    }
}
