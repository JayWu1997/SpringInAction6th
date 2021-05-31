package cn.jay.tacocloud;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TacoOrder
 * @Description:
 * @Author: jay wu
 * @Date: 2021/5/31 8:24
 * @Version: 1.0
 */
@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
