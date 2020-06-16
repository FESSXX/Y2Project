package cn.yhr.book.service.impl;

import cn.yhr.book.dao.impl.bookDaoimpl;
import cn.yhr.book.entity.book;
import cn.yhr.book.service.bookService;

import java.util.List;
import java.util.Map;

public class bookServiceimpl implements bookService {
    bookDaoimpl bd=new bookDaoimpl();
    @Override
    public List<book> getallbook(Map<String, String[]> map) {
        return bd.getallbook(map);
    }

    @Override
    public int updatebook(book b) {
        int num=0;//默认失败
        if (bd.updatebook(b)!=0){
            num =1;
        }
        return num;
    }

    @Override
    public int addbook(book b) {
        int num=0;//默认失败
        if (bd.addbook(b)!=0){
            num =1;
        }
        return num;
    }

    @Override
    public int delbook(int id) {
        int num=0;//默认失败
        if (bd.delbook(id)!=0){
            num =1;
        }
        return num;
    }

    @Override
    public book getbook(int id) {
        return  bd.getbook(id);
    }
}
