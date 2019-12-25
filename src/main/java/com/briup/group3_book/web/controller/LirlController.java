package com.briup.group3_book.web.controller;

import com.briup.group3_book.bean.book;
import com.briup.group3_book.util.Message;
import com.briup.group3_book.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lirl")
@Api(description = "控制类")
public class LirlController {
    @PostMapping("/add")
    @ApiOperation("添加书籍")
    public Message add(book b){
        return MessageUtil.success("添加书籍成功");
    }
    @GetMapping("/delete")
    @ApiOperation("删除书籍")
    public Message delete(book b){
        return MessageUtil.success("删除书籍成功");

    }
    @GetMapping("/search")
    @ApiOperation("查询书籍")
    public Message search(book b){
        return MessageUtil.success("查询书籍成功");
    }
    @PostMapping("/update")
    @ApiOperation("修改书籍")
    public Message update(book b){
        return MessageUtil.success("修改书籍成功");

    }
}
