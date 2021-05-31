package cn.jay.tacocloud;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: Taco
 * @Description:
 * @Author: jay wu
 * @Date: 2021/5/31 8:22
 * @Version: 1.0
 */
@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
