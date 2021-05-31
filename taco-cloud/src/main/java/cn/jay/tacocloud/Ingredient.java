package cn.jay.tacocloud;

import lombok.Data;

/**
 * @ClassName: Ingredient
 * @Description:
 * @Author: jay wu
 * @Date: 2021/5/31 8:15
 * @Version: 1.0
 */
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
