package com.chendecong.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.chendecong.senior1.week1.domain.Movie;
import com.chendecong.senior1.week1.vo.MovieVo;

public interface MovieMapper {

	/**3
	 * 
	 * @Title: list 
	 * @Description: TODO
	 * @param movieVo
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> list(MovieVo movieVo);
	/**
	 * 
	 * @Title: deleteByIds 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: int
	 */
	int deleteByIds(@Param("ids")Integer[] ids);
	/**
	 * 
	 * @Title: updateStatus 
	 * @Description: TODO
	 * @param movie
	 * @return
	 * @return: int
	 */
	@Update("update t_movie set status=#{status} where id=#{id}")
	int updateStatus(Movie movie);

}
