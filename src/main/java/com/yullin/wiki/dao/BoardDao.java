package com.yullin.wiki.dao;

import com.yullin.wiki.dao.Mybatis.BoardMapper;
import com.yullin.wiki.dao.Mybatis.Searchform;
import com.yullin.wiki.domain.Board.Board;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BoardDao implements BoardMapper {

    @Override
    public void save(Board board) {

    }

    @Override
    public Optional<Board> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Board> findAll(Searchform form) {
        return null;
    }

    @Override
    public void updateBoard(Long id, Board updateParam) {

    }

    @Override
    public void addView(Long postId) {

    }

    @Override
    public void deleteBoard(Long postId) {

    }

    @Override
    public List<BoardCardResponse> findBoardCards(String category) {
        return null;
    }
}
