package com.chendecong.senior1.week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendecong.senior1.week1.dao.MovieMapper;
import com.chendecong.senior1.week1.domain.Movie;
import com.chendecong.senior1.week1.service.MovieService;
import com.chendecong.senior1.week1.vo.MovieVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieMapper mapper;
	
	@Override
	public PageInfo<Movie> list(Integer page, Integer pageSize, MovieVo movieVo) {
		PageHelper.startPage(page, 3);
		List<Movie> movie = mapper.list(movieVo);
		return new PageInfo<Movie>(movie);
	}

	@Override
	public int deleteByIds(Integer[] ids) {
		return mapper.deleteByIds(ids);
	}

	@Override
	public int updateStatus(Movie movie) {
		return mapper.updateStatus(movie);
	}
}
