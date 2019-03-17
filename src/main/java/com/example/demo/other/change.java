package com.example.demo.other;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.processing.OperationManager;
import com.qiniu.processing.OperationStatus;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.qiniu.util.UrlSafeBase64;

public class change {


    public static void main(String[] args) {
        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucket = "media";
        String key = "WeChat_20190315222216.mp4";

        String newKey = "H264_type.mp4";
        String saveAs = UrlSafeBase64.encodeToString(bucket + ":" + newKey);        //saveas接口 参数
        String fops = "avthumb/mp4/vcodec/libx264|saveas/" + saveAs;


        Auth auth = Auth.create(accessKey, secretKey);
        //执行操作的管理对象
        String saveMp4Entry = String.format("%s:avthumb_test_target.mp4", bucket);
        String avthumbMp4Fop = String.format("avthumb/mp4|saveas/%s", UrlSafeBase64.encodeToString(saveMp4Entry));


        String persistentPipeline = "whq9898";
//数据处理完成结果通知地址
        String persistentNotifyUrl = "http://api.example.com/qiniu/pfop/notify";

        Configuration cfg = new Configuration(Zone.zone0());
//...其他参数参考类注释
//构建持久化数据处理对象
        OperationManager operationManager = new OperationManager(auth, cfg);
        try {
            String persistentId = operationManager.pfop(bucket, key, fops, persistentPipeline, persistentNotifyUrl, true);
            //可以根据该 persistentId 查询任务处理进度
            System.out.println(persistentId);
            OperationStatus operationStatus = operationManager.prefop(persistentId);
            //解析 operationStatus 的结果
        } catch (QiniuException e) {
            System.err.println(e.response.toString());
        }

    }



}
