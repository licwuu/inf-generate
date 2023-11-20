package com.licw.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ACM模板文件的数据模型
 *
 * @author licw
 * @createDate 2023/11/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ACMTemplateModel {
    /**
     * 作者
     */
    private String author = "author";

    /**
     * 输出提示语句
     */
    private String outputHint = "output: ";

    /**
     * 是否有while循环输入
     */
    private Boolean hasLoop = true;
}
