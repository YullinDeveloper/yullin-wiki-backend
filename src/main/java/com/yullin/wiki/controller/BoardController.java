package com.yullin.wiki.controller;


import com.yullin.wiki.common.BaseResponse;
import com.yullin.wiki.dto.request.Board.BoardCardRequest;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import com.yullin.wiki.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/card")
    public BaseResponse<BoardCardResponse> getBoardCard(@ModelAttribute BoardCardRequest request){
        BoardCardResponse response = boardService.getBoardCard();
        return new BaseResponse<>(response);
    }
}
