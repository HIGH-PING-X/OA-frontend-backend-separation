package games.highping.controller;

import games.highping.service.OaProcessTypeService;
import games.highping.utils.result.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "审批流管理")
@RestController
@RequestMapping("/admin/process")
@CrossOrigin // 跨域
public class ProcessController {

    @Autowired
    private OaProcessTypeService oaProcessTypeService;

    @GetMapping("/findProcessType")
    public Result findProcessType() {
        return Result.ok(oaProcessTypeService.findProcessType());
    }

}
