package com.example.builder;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
    private String addr;
    // ...........


    public static void main(String[] args) {


        User user = User.builder().addr("bj").name("ts").id(1).build();
        System.out.println(user);
    }
}
