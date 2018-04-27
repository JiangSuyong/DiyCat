package com.koala.diycat.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by jsy on 2018/4/27.
 */

public class IconUtils {
    public static void setIcon(Context context, boolean enabledSpecailActivity){

        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(
                        new ComponentName(context,
                                "main.special"),
                enabledSpecailActivity ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                                : PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        PackageManager.DONT_KILL_APP);
        packageManager.setComponentEnabledSetting(
                new ComponentName(context,
                        "main.normal"),
                enabledSpecailActivity ?PackageManager.COMPONENT_ENABLED_STATE_DISABLED:
                        PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }
}
