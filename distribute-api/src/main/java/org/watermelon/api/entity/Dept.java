package org.watermelon.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors              //链式写法注解
public class Dept implements Serializable {

    private int Id;
    private String name;
    private String dataSource;

}
