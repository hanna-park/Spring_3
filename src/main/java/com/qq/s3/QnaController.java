package com.qq.s3;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qq.s3.model.board.QnaVO;
import com.qq.s3.service.board.QnaService;
import com.qq.s3.util.Pager;


@Controller
@RequestMapping(value= "/qna/**")
public class QnaController {

	@Inject
	private QnaService qnaService;
		
	@RequestMapping(value= "qnaList")
	public ModelAndView qnaList(Pager pager) throws Exception{

		List<QnaVO> ar = qnaService.qnaList(pager);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		mv.setViewName("qna/qnaList");
		
		return mv;
	}
	
}
