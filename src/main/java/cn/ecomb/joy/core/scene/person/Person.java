package cn.ecomb.joy.core.scene.person;

import cn.ecomb.joy.core.scene.person.poi.PoiInfo;
import cn.ecomb.joy.core.scene.person.tag.Tag;


/**
 * @author zhouzhigang
 * @date 2018/7/15.
 */
public class Person {

    PoiInfo poiInfo;

    Tag tag;

    public Person(PoiInfo poiInfo) {
        this.poiInfo = poiInfo;
    }

    public Person(PoiInfo poiInfo, Tag tag) {
        this.poiInfo = poiInfo;
        this.tag = tag;
    }

    Person createPerson() {
        /*
        根据参数构建人物形象
        通过 ELBS ，GPS 解析 POI 信息
         */
        return this;
    }
}
