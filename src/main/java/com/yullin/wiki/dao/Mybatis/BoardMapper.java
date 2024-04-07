package com.yullin.wiki.dao.Mybatis;

import com.yullin.wiki.domain.Board.Board;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {
    void save(Board board);
    Optional<Board> findById(int id);
    List<Board> findAll(Searchform form);
    void updateBoard(@Param("id") Long id, @Param("updateParam") Board updateParam);
    void addView(Long postId);
    void deleteBoard(Long postId);
    List<BoardCardResponse> findBoardCards(String category);
}
