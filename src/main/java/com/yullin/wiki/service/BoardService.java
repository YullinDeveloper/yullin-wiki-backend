package com.yullin.wiki.service;

import com.yullin.wiki.dao.BoardDao;
import com.yullin.wiki.dto.request.Board.BoardRequest;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import com.yullin.wiki.dto.response.Board.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDao boardDao;

    public BoardCardResponse getBoardCard() {
        // 아무것도 아님
        System.out.printf(boardDao.toString());
        return new BoardCardResponse();
    }

    public BoardResponse createBoard(BoardRequest request) {
        // todo :
        //  1. parsing 필요
        //  2. List 로 Content들 저장

        return new BoardResponse();
    }

    public BoardResponse getBoard(int boardId) {
        boardDao.getBoard(boardId);
        return new BoardResponse();
    }

//    public List<String> contentParse(String content){
//
//        return new List<String>
//    }

    public BoardResponse deleteBoard(int boardId) {

        return new BoardResponse();
    }
}
