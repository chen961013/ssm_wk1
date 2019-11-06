package com.chendecong.senior1.week1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chendecong.senior1.week1.domain.Movie;
import com.chendecong.senior1.week1.service.MovieService;
import com.chendecong.senior1.week1.utils.PageUtil;
import com.chendecong.senior1.week1.vo.MovieVo;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	/**
	 * 
	 * @Title: list 
	 * @Description: TODO列表方法
	 * @param page
	 * @param request
	 * @param pageSize
	 * @param model
	 * @param movieVo
	 * @return
	 * @return: String
	 */
	@RequestMapping("selects")
	public String list(@RequestParam(defaultValue = "1") Integer page,HttpServletRequest request,Integer pageSize,Model model, MovieVo movieVo ) {
		
		if(null == movieVo.getOrderMethod()) {
			movieVo.setOrderMethod("asc");
		}
		// 分页
		PageInfo<Movie> info = movieService.list(page,pageSize,movieVo);
		PageUtil.page(request, "/selects", info.getPageSize(), info.getList(), (int)info.getTotal(), page);
		model.addAttribute("info", info);
		model.addAttribute("movieVo", movieVo);
		List<Movie> list = info.getList();
		for (Movie movie : list) {
			System.out.println(movie);
			
		}
		return "movielist";
	}
	
	/**
	 * 
	 * @Title: deleteByIds 
	 * @Description: TODO删除
	 * @param ids
	 * @return
	 * @return: String
	 */
	@RequestMapping("deleteByIds")
	public String deleteByIds(@RequestParam("ids") Integer[]ids) {
		int i = movieService.deleteByIds(ids);
		return "redirect:selects";
	}
	
	/**
	 * 
	 * @Title: updateStatus 上下加修改
	 * @Description: TODO
	 * @param movie
	 * @return
	 * @return: String
	 */
	@RequestMapping("updateStatus")
	public String updateStatus(Movie movie) {
		int i = movieService.updateStatus(movie);
		return "redirect:selects";
	}
}
