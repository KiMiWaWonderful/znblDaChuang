package com.znbl.common.serviceImpl;

import com.znbl.common.entity.AudPlayer;
import com.znbl.common.mapper.AudPlayerMapper;
import com.znbl.common.service.AudPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudPlayerServiceImpl implements AudPlayerService {

    @Autowired
    AudPlayerMapper audPlayerMapper;

    public void addAudPlayer() {
        audPlayerMapper.addAudPlayer();
    }

    public List<AudPlayer> listOfAudPlayer() {
        return audPlayerMapper.listOfAudPlayer();
    }
}
