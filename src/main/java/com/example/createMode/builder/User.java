package com.example.createMode.builder;

import org.apache.commons.lang3.StringUtils;


public class User {

    private Integer id;
    private String name;
    private String addr;
    // ...........
    public User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.addr = builder.addr;
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private Integer id;
        private String name;
        private String addr;

        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            if(StringUtils.isBlank(name)){
                throw new RuntimeException("名称不能为空");
            }
            this.name = name;
            return this;
        }

        public Builder addr(String addr){
            if(StringUtils.isBlank(addr)){
                throw new RuntimeException("名称不能为空");
            }
            this.addr = addr;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public static void main(String[] args) {


        User user = User.builder().addr("bj").name("ts").id(1).build();
        System.out.println(user);
    }
}
