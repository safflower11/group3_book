package com.briup.group3_book.bean;

import io.swagger.annotations.ApiModelProperty;

public class book {
    @ApiModelProperty(value = "书籍编号",required =true)
    private int book_id;//书籍编号
    @ApiModelProperty(value = "作者")
    private String author;//作者
    @ApiModelProperty(value = "书籍名字")
    private String name;
    @ApiModelProperty(value = "出版社")
    private String address;//出版社
    @ApiModelProperty(value = "书籍描述")
    private String desp;//描述git

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }
}
