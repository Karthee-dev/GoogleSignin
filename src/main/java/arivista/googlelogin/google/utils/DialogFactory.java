package arivista.googlelogin.google.utils;

import android.app.ProgressDialog;
import android.content.Context;

import arivista.googlelogin.R;


public final class DialogFactory {
  private DialogFactory() {
  }

  public static ProgressDialog createLoadingDialog(Context context) {
    ProgressDialog loadingDialog = new ProgressDialog(context, ProgressDialog.THEME_HOLO_LIGHT);
    loadingDialog.setCancelable(false);
    loadingDialog.setCanceledOnTouchOutside(false);
    loadingDialog.setMessage(context.getString(R.string.loading));
    return loadingDialog;
  }
}
