package com.foxconn.camerademo;

import android.content.Context;
import android.content.pm.PackageManager;

public class CameraCheckUtils {

    private CameraCheckUtils(){
        throw new AssertionError();

    }

    /** 检测设备是否存在Camera硬件 */
    public static boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA)) {
            // 存在
            return true;
        } else {
            // 不存在
            return false;
        }
    }

    /**检查相机是否支持自动对焦*/
    public static boolean cameraHasAutoFocus(Context context){
        if (context.getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA_AUTOFOCUS)) {
            return true;
        } else {
            return false;
        }

    }


}
