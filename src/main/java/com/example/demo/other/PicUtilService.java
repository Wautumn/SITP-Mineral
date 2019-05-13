package com.example.demo.other;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.processing.OperationManager;
import com.qiniu.processing.OperationStatus;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: WHQ
 * @Date: 2019/5/12 21:24
 */
public class PicUtilService {
    class Ret {
        public long fsize;
        public String key;
        public String hash;
        public int width;
        public int height;
    }

    public static void main(String[] args) {
        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucketname = "pic2";
        String finalurl = "";
        String finalurl2 = "";

        HashMap<String, String> fileurl = new HashMap<>();
        File file2 = new File("C:\\Users\\22831\\Desktop\\SITP\\图片\\手标本图片");
        System.out.println(file2.listFiles().length);
        for (File f : file2.listFiles()) {
            System.out.println(f.getName());
            File thisfile = new File(f.getAbsolutePath());
            Configuration cfg = new Configuration(Zone.zone2());
            UploadManager uploadManager = new UploadManager(cfg);
            try {
                Auth auth = Auth.create(accessKey, secretKey);
                String upToken = auth.uploadToken(bucketname);
                Response res = uploadManager.put(thisfile, null, upToken);
                Ret ret = res.jsonToObject(Ret.class);
                System.out.println("http://pre7qor2p.bkt.clouddn.com//" + ret.key);
                String url = "http://pre7qor2p.bkt.clouddn.com//" + ret.key;
                finalurl += url + ",";
                fileurl.put(f.getName(), url);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
//        List<String> list1 = new ArrayList<String>(fileurl.keySet());//文件名list
//        System.out.println(list1.size());
//        for (int i = 0; i < fileurl.keySet().size(); i++) {
//            finalurl2 += fileurl.get(list1.get(i));
//        }
        System.out.println(finalurl);
//        System.out.println(finalurl2);
//
    }
}
