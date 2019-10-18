package fl.aapttest.com;

import fl.aapttest.com.apkUtil.entity.ApkInfo;
import fl.aapttest.com.apkUtil.utils.ApkUtil;
import fl.aapttest.com.apkUtil.utils.IconUtil;

public class Main {

    public static void main(String[] args) {



	// write your code here
        try {
            String apkpath = "/Users/feilong/Downloads/yingmitiantang.apk";
            if (args.length > 0) {
                apkpath = args[0];
            }
            ApkInfo apkInfo = new ApkUtil().getApkInfo(apkpath);
            // 打印获取到的信息
            System.out.println(apkInfo);
            // 获取Icon并保存到指定位置
            IconUtil.extractFileFromApk(apkpath, apkInfo.getApplicationIcon(), "/Users/feilong/Downloads/icon.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
