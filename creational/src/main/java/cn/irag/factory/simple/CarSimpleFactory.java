package cn.irag.factory.simple;

import cn.irag.entry.ICarProduct;
import cn.irag.entry.TeslaCar;
import cn.irag.entry.XiaomiCar;

/**
 * 简单工厂【也叫静态工厂】，如果新增功能扩展，需要修改这个文件；
 * 例如：新增华为汽车，就要改 getCar 方法代码
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/22
 */
public class CarSimpleFactory {

    // ========【抽象的核心】这种有if判断的代码就可以向上提取成为公共接口，然后不同类实现不同逻辑。 =======
    public static ICarProduct getCar(String type) {
        if ("tesla".equals(type)) {
            return new TeslaCar();
        } else if ("Xiaomi".equals(type)) {
            return new XiaomiCar();
        } else {
            return null;
        }
    }

}
