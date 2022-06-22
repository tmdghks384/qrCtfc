package com.example.qrctfc.Mapper;

import com.example.qrctfc.VO.AdminVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    public int joinAdmin(AdminVO vo);
}
