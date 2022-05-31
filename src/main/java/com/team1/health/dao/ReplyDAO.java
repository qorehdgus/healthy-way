package com.team1.health.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.team1.health.vo.ReplyVO;

@Mapper
@Repository
public interface ReplyDAO {
	// 댓글목록
	public List<ReplyVO> replyList(int board_num);
	
	// 댓글등록
	public int replyWrite(ReplyVO vo);

	// 댓글삭제
	public int replyDel(int reply_num, String user_id);

	// 댓글 수정
	public int replyEdit(ReplyVO vo);

}
