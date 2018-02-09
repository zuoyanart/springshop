package com.company.project.model;

import javax.persistence.*;

@Table(name = "pz_node")
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer pid;

    private String name;

    private String nodepath;

    private String link;

    private Integer weight;

    @Column(name = "article_type")
    private String articleType;

    /**
     * seo
     */
    private String keyword;

    /**
     * seo
     */
    private String seodes;

    private Integer ishide;

    private Short mgwidth;

    private Short mgheight;

    private String timg;

    private String brief;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return nodepath
     */
    public String getNodepath() {
        return nodepath;
    }

    /**
     * @param nodepath
     */
    public void setNodepath(String nodepath) {
        this.nodepath = nodepath;
    }

    /**
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * @return article_type
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * @param articleType
     */
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    /**
     * 获取seo
     *
     * @return keyword - seo
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置seo
     *
     * @param keyword seo
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * 获取seo
     *
     * @return seodes - seo
     */
    public String getSeodes() {
        return seodes;
    }

    /**
     * 设置seo
     *
     * @param seodes seo
     */
    public void setSeodes(String seodes) {
        this.seodes = seodes;
    }

    /**
     * @return ishide
     */
    public Integer getIshide() {
        return ishide;
    }

    /**
     * @param ishide
     */
    public void setIshide(Integer ishide) {
        this.ishide = ishide;
    }

    /**
     * @return mgwidth
     */
    public Short getMgwidth() {
        return mgwidth;
    }

    /**
     * @param mgwidth
     */
    public void setMgwidth(Short mgwidth) {
        this.mgwidth = mgwidth;
    }

    /**
     * @return mgheight
     */
    public Short getMgheight() {
        return mgheight;
    }

    /**
     * @param mgheight
     */
    public void setMgheight(Short mgheight) {
        this.mgheight = mgheight;
    }

    /**
     * @return timg
     */
    public String getTimg() {
        return timg;
    }

    /**
     * @param timg
     */
    public void setTimg(String timg) {
        this.timg = timg;
    }

    /**
     * @return brief
     */
    public String getBrief() {
        return brief;
    }

    /**
     * @param brief
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }
}