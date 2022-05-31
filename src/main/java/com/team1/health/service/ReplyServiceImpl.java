package com.team1.health.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.team1.health.dao.ReplyDAO;
import com.team1.health.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Inject
	ReplyDAO dao;
	
	@Override
	public List<ReplyVO> replyList(int board_num) {
		return dao.replyList(board_num);
	}

	@Override
	public int replyWrite(ReplyVO vo) {
		return dao.replyWrite(vo);
	}

	@Override
	public int replyDel(int reply_num, String user_id) {
		return dao.replyDel(reply_num, user_id);
	}

	@Override
	public int replyEdit(ReplyVO vo) {
		return dao.replyEdit(vo);
	}


}