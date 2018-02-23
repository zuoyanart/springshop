package com.company.project.model;

import javax.persistence.*;

@Table(name = "pz_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String timg;

    private String brief;

    private Integer nodeid;

    private Integer count;

    private Integer reco;

    private Integer uid;

    private Integer pass;

    private String source;

    private String tags;

    private String link;

    private Integer comment;

    private Integer state;

    private Integer createtime;

    @Transient
    private Node node;

    /**
     * 本月点击
     */
    private Byte mooncount;

    /**
     * 最后点击时间
     */
    private Integer lastclicktime;

    private String content;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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

    /**
     * @return nodeid
     */
    public Integer getNodeid() {
        return nodeid;
    }

    /**
     * @param nodeid
     */
    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return reco
     */
    public Integer getReco() {
        return reco;
    }

    /**
     * @param reco
     */
    public void setReco(Integer reco) {
        this.reco = reco;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return pass
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * @param pass
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
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
     * @return comment
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return createtime
     */
    public Integer getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取本月点击
     *
     * @return mooncount - 本月点击
     */
    public Byte getMooncount() {
        return mooncount;
    }

    /**
     * 设置本月点击
     *
     * @param mooncount 本月点击
     */
    public void setMooncount(Byte mooncount) {
        this.mooncount = mooncount;
    }

    /**
     * 获取最后点击时间
     *
     * @return lastclicktime - 最后点击时间
     */
    public Integer getLastclicktime() {
        return lastclicktime;
    }

    /**
     * 设置最后点击时间
     *
     * @param lastclicktime 最后点击时间
     */
    public void setLastclicktime(Integer lastclicktime) {
        this.lastclicktime = lastclicktime;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public Node getNode() {
        return node;
    }

    public  void setNode(Node node) {
        this.node = node;
    }
}