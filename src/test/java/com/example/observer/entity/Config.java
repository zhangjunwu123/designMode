package com.example.observer.entity;

public class Config {

    private Integer id;
    private String group;
    private String namespace;
    private String content;

    public Config() {}

    public Config(Integer id, String group, String namespace, String content) {
        this.id = id;
        this.group = group;
        this.namespace = namespace;
        this.content = content;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", namespace='" + namespace + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
