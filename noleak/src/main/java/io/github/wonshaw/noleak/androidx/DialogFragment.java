package io.github.wonshaw.noleak.androidx;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import io.github.wonshaw.noleak.dialog.WeakDialog;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new WeakDialog(requireContext(), getTheme());
    }
}
