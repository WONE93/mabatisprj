package co.chloe.prj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVo> getMemberList();
	MemberVo getMember(MemberVo vo);
	void setMemberInsert(MemberVo vo);
	void setMemberUpdate(MemberVo vo);
	void setMemberDelete(MemberVo vo);
	
}
