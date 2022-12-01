package com.jr.until;


import java.util.List;
//分页工具类
public class PageHelper<T> {

    private int totalCount;//数据总条数
    private int pageSize;//每页显示条数
    private int indexPage;//当前是第几页
    private int totalPage;//一共有多少页
    private List<T> pageList;//每页显示的集合
    private int startNum;//开始行

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(int indexPage) {
        this.indexPage = indexPage;
    }

    //计算总页数：总条数
    public int getTotalPage() {
        return totalCount%pageSize==0?
                totalCount/pageSize:
                totalCount/pageSize+1;
    }


    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    //给开始行数赋值：开始行==（当前页-1）* 每页显示的行数
    public int getStartNum() {
        return (indexPage-1)*pageSize;
    }


}
