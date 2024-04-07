package com.yullin.wiki.controller;


import com.yullin.wiki.common.BaseResponse;
import com.yullin.wiki.dto.request.Board.BoardCardRequest;
import com.yullin.wiki.dto.response.Board.BoardCreateResponse;
import com.yullin.wiki.dto.request.Board.BoardRequest;
import com.yullin.wiki.dto.response.Board.BoardCardResponse;
import com.yullin.wiki.dto.response.Board.BoardResponse;
import com.yullin.wiki.service.BoardService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;



@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @ResponseBody
    @GetMapping(value = "/{boardId}")
    public BaseResponse<BoardResponse> getBoard(@PathVariable int boardId){
        BoardResponse response = boardService.getBoard(boardId);
        return new BaseResponse<>(response);
    }

    @ResponseBody
    @PostMapping(value ="/{memberId}/content")
    public  BaseResponse<BoardResponse> uploadBoard(@RequestBody BoardRequest request) {
        BoardResponse response = boardService.createBoard(request);
        return new BaseResponse<>(response);
    }

    // card 형태의 board 들 조회하기
    @GetMapping("/card")
    public BaseResponse<BoardCardResponse> getBoardCard(@RequestBody BoardCardRequest request){
        BoardCardResponse response = boardService.getBoardCard(request);
        return new BaseResponse<>(response);
    }

    @ResponseBody
    @ApiOperation(value = "delete sample",
            notes = "sample 에서 해당 id 기준의 값을 삭제한다.",
            httpMethod = "DELETE")
    @DeleteMapping("/{boardId}/delete")
    public BaseResponse<BoardResponse> deleteBoard(@PathVariable int boardId){
        BoardResponse response = boardService.deleteBoard(boardId);
        return new BaseResponse<>(response);
    }
}