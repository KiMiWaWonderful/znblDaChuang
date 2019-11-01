package com.company.lanqiao;

import java.io.File;
import java.io.FilenameFilter;

public class WenJianGuanLi {

    public static class JavaFilter implements FilenameFilter {
        String jf;
        JavaFilter(String s){
            jf=s;
        }
        //实现FilenameFilter接口的accept()方法
        public boolean accept(File dir,String name){
            return name.startsWith(jf);//name的前缀是否是参数jf
        }
    }


    public static void main(String[] args) throws Exception {
        File f=new File("/DaSai");
        //过滤以“Ex”开头的文件和目录，存放到字符串数组s中。
          String[] s = f.list(new JavaFilter("Ex"));// 填空
        for(int i=0;i<s.length;i++){
            File ff=new File(s[i]);// 根据s[i]创建File类对象
            if(ff.isDirectory())
                System.out.println(s[i]+" is a directory");
            else
                System.out.println(s[i]+" is a file");
        }
    }

}
