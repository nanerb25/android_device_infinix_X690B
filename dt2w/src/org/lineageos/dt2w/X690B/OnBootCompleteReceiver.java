package org.lineageos.dt2w.X690B;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.UserHandle;

public class OnBootCompleteReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent sIntent = new Intent(context, DT2WServiceX690B.class);
        context.startServiceAsUser(sIntent, UserHandle.CURRENT);
    }
}
