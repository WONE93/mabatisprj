package co.chloe.prj.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.chloe.prj.member.service.MemberService;
import co.chloe.prj.member.service.MemberVo;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;  //dao 역할
	
	@RequestMapping("/memberlist.do")
	public String memberlist(Model model) {
		List<MemberVo> list = memberService.getMemberList();
		model.addAttribute("member", list);
		return "member/memberlist";
	}
}
