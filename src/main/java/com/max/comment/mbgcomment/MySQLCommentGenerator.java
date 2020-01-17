package com.max.comment.mbgcomment;

import org.apache.commons.lang.time.DateFormatUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Calendar;
import java.util.Properties;

public class MySQLCommentGenerator extends EmptyCommentGenerator {

    //开始的分隔符，例如mysql为`，sqlserver为[
    private String beginningDelimiter = "";
    //结束的分隔符，例如mysql为`，sqlserver为]
    private String endingDelimiter = "";

    private Properties properties;

    public MySQLCommentGenerator() {
        properties = new Properties();
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        // 获取自定义的 properties
        this.properties.putAll(properties);
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");

        // 获取表注释
        String remarks = introspectedTable.getRemarks();

        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * " + remarks);
        topLevelClass.addJavaDocLine(" *");
        topLevelClass.addJavaDocLine(" * @author " + author);
        topLevelClass.addJavaDocLine(" * @date " + DateFormatUtils.format(Calendar.getInstance(), "yyyy年MM月dd日 HH:mm:ss"));
        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列名称注释
        String remarks = introspectedColumn.getRemarks();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + remarks);
        field.addJavaDocLine(" */");

        //添加注解
//        for (IntrospectedColumn column : introspectedTable.getPrimaryKeyColumns()) {
//            if (introspectedColumn == column) {
//                field.addAnnotation("@Id");
//                break;
//            }
//        }
//        String column = introspectedColumn.getActualColumnName();
//        if (StringUtility.stringContainsSpace(column) || introspectedTable.getTableConfiguration().isAllColumnDelimitingEnabled()) {
//            column = introspectedColumn.getContext().getBeginningDelimiter()
//                    + column
//                    + introspectedColumn.getContext().getEndingDelimiter();
//        }
//        field.addAnnotation("@Column(name = \"" + getDelimiterName(column) + "\")");
    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        // 获取Getter注释
        String remarks = introspectedColumn.getRemarks();
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * 获取" + remarks);
        method.addJavaDocLine(" */");
        // 获取Getter注释  + @return
//        StringBuilder sb = new StringBuilder();
//        method.addJavaDocLine("/**");
//        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//            sb.append(" * 获取");
//            sb.append(introspectedColumn.getRemarks());
//            method.addJavaDocLine(sb.toString());
//            method.addJavaDocLine(" *");
//        }
//        sb.setLength(0);
//        sb.append(" * @return ");
//        sb.append(introspectedColumn.getActualColumnName());
//        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//            sb.append(" - ");
//            sb.append(introspectedColumn.getRemarks());
//        }
//        method.addJavaDocLine(sb.toString());
//        method.addJavaDocLine(" */");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        // 获取Setter注释
        String remarks = introspectedColumn.getRemarks();
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * 设置" + remarks);
        method.addJavaDocLine(" */");
        // 获取Setter注释 +@param
//        StringBuilder sb = new StringBuilder();
//        method.addJavaDocLine("/**");
//        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//            sb.append(" * 设置");
//            sb.append(introspectedColumn.getRemarks());
//            method.addJavaDocLine(sb.toString());
//            method.addJavaDocLine(" *");
//        }
//        Parameter parm = method.getParameters().get(0);
//        sb.setLength(0);
//        sb.append(" * @param ");
//        sb.append(parm.getName());
//        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//            sb.append(" ");
//            sb.append(introspectedColumn.getRemarks());
//        }
//        method.addJavaDocLine(sb.toString());
//        method.addJavaDocLine(" */");
    }

    public String getDelimiterName(String name) {
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(beginningDelimiter);
        nameBuilder.append(name);
        nameBuilder.append(endingDelimiter);
        return nameBuilder.toString();
    }
}
