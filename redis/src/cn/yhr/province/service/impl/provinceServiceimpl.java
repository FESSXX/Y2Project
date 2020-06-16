package cn.yhr.province.service.impl;

import cn.yhr.province.dao.impl.provinceDaoimpl;
import cn.yhr.province.entity.province;
import cn.yhr.province.service.provinceService;

import java.util.List;
import java.util.Map;

public class provinceServiceimpl implements provinceService {
    provinceDaoimpl pd=new provinceDaoimpl();
    @Override
    public List<province> getallprovince() {
        return pd.getallprovince();
    }
}
