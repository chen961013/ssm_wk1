package com.chendecong.senior1.week1.service;

import com.chendecong.senior1.week1.domain.Movie;
import com.chendecong.senior1.week1.vo.MovieVo;
import com.github.pagehelper.PageInfo;

public interface MovieService {
	/**
	 * 
	 * @Title: list 
	 * @Description: TODO
	 * @param page
	 * @param pageSize
	 * @param movieVo
	 * @return
	 * @return: PageInfo<Movie>
	 */
	PageInfo<Movie> list(Integer page, Integer pageSize, MovieVo movieVo);
	/**
	 * 
	 * @Title: deleteByIds 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: int
	 */
	int deleteByIds(Integer[] ids);
	/**
	 * 
	 * @Title: updateStatus 
	 * @Description: TODO
	 * @param movie
	 * @return
	 * @return: int
	 */
	int updateStatus(Movie movie);


}
