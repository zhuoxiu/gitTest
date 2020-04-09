package com.zhuoxiu;


/**
 * git上传到github测试代码
 */
public class git_test {
    public static void main(String[] args) {
        forMethod();
        cloneTest();
    }

    private static void rollbackTest(){
        System.out.println(1);
    }

    private static void forMethod(){
        //循环打印10次
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
        }

    }

    private static void cloneTest(){
        //开发人员二添加
        for (int i = 0; i < 20; i++) {
            System.out.println("开发人员二");
        }
    }
}
