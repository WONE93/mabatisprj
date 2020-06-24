package co.chloe.prj.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.chloe.prj.member.map.MemberMap;
import co.chloe.prj.member.service.MemberService;
import co.chloe.prj.member.service.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMap memberMap;
	
	@Override
	public List<MemberVo> getMemberList() {
		// TODO Auto-generated method stub
		return memberMap.getMemberList();
	}

	@Override
	public MemberVo getMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return memberMap.getMember(vo);
	}

	@Override
	public void setMemberInsert(MemberVo vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberInsert(vo);
	}

	@Override
	public void setMemberUpdate(MemberVo vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberUpdate(vo);

	}

	@Override
	public void setMemberDelete(MemberVo vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberDelete(vo);
	}

}
