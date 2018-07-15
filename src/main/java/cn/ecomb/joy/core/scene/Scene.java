package cn.ecomb.joy.core.scene;

import cn.ecomb.joy.core.scene.person.Person;
import cn.ecomb.joy.core.scene.person.poi.PoiInfo;
import cn.ecomb.joy.core.scene.site.Location;

import java.util.List;

/**
 * @author zhouzhigang
 * @date 2018/7/15.
 */
public class Scene {

    Person person;

    List<Location> locations;

    void register(PoiInfo poiInfo) {

    }

    Person createPerson() {
        /*
        根据参数构建人物形象
        通过 ELBS ，GPS 解析 POI 信息
         */
        return null;
    }

}
