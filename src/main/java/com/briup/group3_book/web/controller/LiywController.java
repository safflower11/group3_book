package com.briup.group3_book.web.controller;

import com.briup.group3_book.bean.book;
import com.briup.group3_book.util.Message;
import com.briup.group3_book.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiywController {
    @ApiOperation("添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name="book_id",value="书籍ID",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="书籍名称",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value="作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="address",value="出版社",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="desp",value="书籍描述",paramType = "query",dataType = "String")
    })
    @PostMapping("/add")
    public Message add(book book1){
        return MessageUtil.success("添加成功！");
    }


    @ApiOperation("删除图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name="book_id",value="ID",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="书籍名字",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value="作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="address",value="出版社",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="desp",value="书籍描述",paramType = "query",dataType = "String")
    })
    @GetMapping("/delete")
    public Message delete(book book1){
        return MessageUtil.success("删除成功！");
    }
}
