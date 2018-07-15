package cn.ecomb.joy.controller;

import cn.ecomb.joy.controller.vo.req.StandardPOIVO;
import cn.ecomb.joy.dto.StandardServiceDTO;
import cn.ecomb.joy.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/7/15.
 */
@RestController
@RequestMapping("/standard")
public class StandardController {

    @Autowired
    StandardService standardService;

    /**
     * 获取标准服务
     * @param standardPOIVO
     * @return
     */
    @GetMapping
    public StandardServiceDTO getStandardService(StandardPOIVO standardPOIVO) {

        // 参数校验

        return standardService.getStandardService(standardPOIVO);
    }
}
