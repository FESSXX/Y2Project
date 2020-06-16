package cn.yhr.book.service.impl;

import cn.yhr.book.dao.impl.booktypeDaoimpl;
import cn.yhr.book.entity.booktype;
import cn.yhr.book.service.booktypeService;

import java.util.List;

public class booktypeServiceimpl implements booktypeService {
    booktypeDaoimpl bt=new booktypeDaoimpl();
    @Override
    public List<booktype> getalltype() {
        return bt.getalltype();
    }
}
