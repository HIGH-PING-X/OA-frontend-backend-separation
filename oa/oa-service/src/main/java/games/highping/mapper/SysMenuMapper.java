package games.highping.mapper;

import games.highping.bean.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author HIGH-
* @description 针对表【sys_menu(菜单表)】的数据库操作Mapper
* @createDate 2023-12-08 16:44:05
* @Entity games.highping.bean.SysMenu
*/
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> findMenuListByUserId(@Param("userId") Long userId);
}




