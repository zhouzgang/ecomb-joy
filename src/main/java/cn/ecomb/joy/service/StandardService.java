package cn.ecomb.joy.service;

import cn.ecomb.joy.controller.vo.req.StandardPOIVO;
import cn.ecomb.joy.dto.StandardServiceDTO;

/**
 * @author zhouzhigang
 * @date 2018/7/15.
 */
public interface StandardService {

    StandardServiceDTO getStandardService(StandardPOIVO standardPOIVO);
}
