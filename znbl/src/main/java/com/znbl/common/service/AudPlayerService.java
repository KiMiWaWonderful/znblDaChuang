package com.znbl.common.service;

import com.znbl.common.entity.AudPlayer;

import java.util.List;

public interface AudPlayerService {
    //增加观众
    public void addAudPlayer();

    //得到观众的集合
    public List<AudPlayer> listOfAudPlayer();
}
