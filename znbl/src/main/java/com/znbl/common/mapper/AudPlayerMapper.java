package com.znbl.common.mapper;

import com.znbl.common.entity.AudPlayer;

import java.util.List;

public interface AudPlayerMapper {

    //增加观众
    public void addAudPlayer();

    //得到观众的集合
    public List<AudPlayer> listOfAudPlayer();
}
