package kr.green.javaspring.dao;

import org.apache.ibatis.annotations.Param;

public interface Mapper {

	public String getId(@Param("id") String id);
	public String getPasswd(@Param("id") String id);
	public String getEmail(@Param("id") String id);
	
	public UserVO getUser(@Param("id") String id);
}
