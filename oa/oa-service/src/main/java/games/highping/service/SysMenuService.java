package games.highping.service;

import games.highping.bean.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import games.highping.utils.vo.AssginMenuVo;
import games.highping.utils.vo.RouterVo;

import java.util.List;

/**
* @author HIGH-
* @description 针对表【sys_menu(菜单表)】的数据库操作Service
* @createDate 2023-12-08 16:44:05
*/
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> findNodes();

    void removeMenuById(Long id);

    List<SysMenu> findSysMenuByRoleId(Long roleId);

    void doAssign(AssginMenuVo assignMenuVo);

    List<RouterVo> findUserMenuListByUserId(Long userId);

    List<String> findUserPermsByUserId(Long userId);
}
