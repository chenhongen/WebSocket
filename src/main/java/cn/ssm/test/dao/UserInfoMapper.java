package cn.ssm.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ssm.test.domain.UserInfo;
import cn.ssm.test.vo.pageVO;
import cn.ssm.test.vo.UserVO;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    /**
     * 根据goodsCd获得对应UserInfo对象
     * @param goodsCd
     * @return
     */
    UserInfo selectByGoodsCd(String goodsCd);

	UserInfo selectByUsername(String username);
	
	UserVO selectUserByCd(String userCd);
	
	UserVO selectUserByNmAndPsd(@Param(value="usercd") String usercd,@Param(value="pwd") String pwd);

	/**
     * 根据applyCd获得对应UserInfo对象
     * @param applyCd
     * @return
     */
	UserInfo selectByApplyCd(String applycd);

	/**
	 * 根据usercd更新用户信息
	 * @param user
	 * @return
	 */
	int updateByCdSelective(UserInfo user);

	/**
	 * 根据关注的userCd查询关注用户总数
	 * @param userCd
	 * @return
	 */
	int selectUserByUserCd(String userCd);

	/**
	 * 根据关注的userCd查询关注用户List
	 * @param userCd
	 * @param pagevo 
	 * @return
	 */
	List<UserInfo> selectUserByUserCdAndPageVo(@Param(value="userCd") String userCd,@Param(value="pagevo") pageVO pagevo);

	List<UserVO> selectUser(@Param(value="status") int status, @Param(value="username") String username, @Param(value="pagevo") pageVO pagevo);

	int selectTotalUser(@Param(value="status") int status, @Param(value="username") String username);
}