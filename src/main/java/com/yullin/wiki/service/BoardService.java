package com.yullin.wiki.service;

import com.yullin.wiki.dao.BoardDao;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDao boardDao;

    public BoardCardResponse getBoardCard() {
        // 아무것도 아님
        System.out.printf(boardDao.toString());
        return new BoardCardResponse();
    }
}
