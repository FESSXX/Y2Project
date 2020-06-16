package cn.yhr.book.dao;

import cn.yhr.book.entity.book;

import java.util.List;
import java.util.Map;

public interface bookDao {
    public List<book> getallbook(Map<String,String[]>map);//获取所有图书信息加查询
    public  int updatebook(book b);//修改图书信息
    public  int addbook(book b);//新增图书信息
    public  int delbook(int id);//删除图书信息
    public  book getbook(int id);
}
