package com.hzit.bean;

public class LoginResp<T>{



        private  int code; //0 代表，请求成功，其他全是失败

        private String msg; //返回提示


        private T data; //泛型 其他数据

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }


