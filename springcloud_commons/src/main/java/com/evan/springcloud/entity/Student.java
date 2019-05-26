package com.evan.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 11:31
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String dataSource;
}
