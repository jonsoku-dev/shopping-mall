package com.example.shoppingmall.qna.mapper;

import com.example.shoppingmall.qna.domain.Qna;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface QnaMapper {
    List<Qna> findByItemNo(Long itemNo);

    String getMemberIdByNo(Long memberNo);

    Long getmemberNoById(String memberId);

    void addQna(Qna qna);
}
