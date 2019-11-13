package com.qq.s3;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qq.s3.model.board.QnaVO;
import com.qq.s3.service.board.QnaService;
import com.qq.s3.util.Pager;


@Controller
@RequestMapping(value= "/qna/**")
public class QnaController {

	@Inject
	private QnaService qnaService;
	
	@RequestMapping(value="qnaReply", method=RequestMethod.POST)
	public String qnaReply(QnaVO qnaVO) throws Exception{
		int result = qnaService.qnaReply(qnaVO);
		return "redirect: ./qnaList";
	}
	
	@RequestMapping(value="qnaReply", method=RequestMethod.GET)
	public void qnaReply(int num, Model model) throws Exception{
		model.addAttribute("num",num);
	}
	
	@RequestMapping(value="qnaSelect", method= RequestMethod.GET)
	public void qnaSelect(int num,Model model) throws Exception{
		QnaVO qnaVO = qnaService.qnaSelect(num);
		model.addAttribute("dto",qnaVO);
	}
	
	@RequestMapping(value = "qnaWrite", method = RequestMethod.POST)
	public String qnaWrite(QnaVO qnaVO) throws Exception{
		int result = qnaService.qnaWrite(qnaVO);
		return "redirect: ./qnaList";
	}
	
	@RequestMapping(value = "qnaWrite", method = RequestMethod.GET)
	public void qnaWrite() throws Exception{
		
	}
	
		
	@RequestMapping(value= "qnaList", method = RequestMethod.GET)
	public ModelAndView qnaList(Pager pager) throws Exception{

		List<QnaVO> ar = qnaService.qnaList(pager);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		mv.setViewName("qna/qnaList");
		
		return mv;
	}
	
}
