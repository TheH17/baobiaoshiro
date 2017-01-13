/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SelfSite implements Serializable {

    private static final long serialVersionUID = -666971950;

    private Integer       id;
    private Integer       position;
    private String        url;
    private String        code;
    private String        name;
    private String        category;
    private Integer       orderIndex;
    private LocalDateTime fetchTime;
    private String        textValue;
    private String        htmlValue;
    private Timestamp     dateValue;
    private BigDecimal    numValue;
    private String        serverNum;
    private String        domain;
    private Integer       urlId;
    private String        location;
    private String        description;
    private String        mirrorUrl;
    private Integer       classId;

    public SelfSite() {}

    public SelfSite(SelfSite value) {
        this.id = value.id;
        this.position = value.position;
        this.url = value.url;
        this.code = value.code;
        this.name = value.name;
        this.category = value.category;
        this.orderIndex = value.orderIndex;
        this.fetchTime = value.fetchTime;
        this.textValue = value.textValue;
        this.htmlValue = value.htmlValue;
        this.dateValue = value.dateValue;
        this.numValue = value.numValue;
        this.serverNum = value.serverNum;
        this.domain = value.domain;
        this.urlId = value.urlId;
        this.location = value.location;
        this.description = value.description;
        this.mirrorUrl = value.mirrorUrl;
        this.classId = value.classId;
    }

    public SelfSite(
        Integer       id,
        Integer       position,
        String        url,
        String        code,
        String        name,
        String        category,
        Integer       orderIndex,
        LocalDateTime fetchTime,
        String        textValue,
        String        htmlValue,
        Timestamp     dateValue,
        BigDecimal    numValue,
        String        serverNum,
        String        domain,
        Integer       urlId,
        String        location,
        String        description,
        String        mirrorUrl,
        Integer       classId
    ) {
        this.id = id;
        this.position = position;
        this.url = url;
        this.code = code;
        this.name = name;
        this.category = category;
        this.orderIndex = orderIndex;
        this.fetchTime = fetchTime;
        this.textValue = textValue;
        this.htmlValue = htmlValue;
        this.dateValue = dateValue;
        this.numValue = numValue;
        this.serverNum = serverNum;
        this.domain = domain;
        this.urlId = urlId;
        this.location = location;
        this.description = description;
        this.mirrorUrl = mirrorUrl;
        this.classId = classId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getOrderIndex() {
        return this.orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public LocalDateTime getFetchTime() {
        return this.fetchTime;
    }

    public void setFetchTime(LocalDateTime fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getTextValue() {
        return this.textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getHtmlValue() {
        return this.htmlValue;
    }

    public void setHtmlValue(String htmlValue) {
        this.htmlValue = htmlValue;
    }

    public Timestamp getDateValue() {
        return this.dateValue;
    }

    public void setDateValue(Timestamp dateValue) {
        this.dateValue = dateValue;
    }

    public BigDecimal getNumValue() {
        return this.numValue;
    }

    public void setNumValue(BigDecimal numValue) {
        this.numValue = numValue;
    }

    public String getServerNum() {
        return this.serverNum;
    }

    public void setServerNum(String serverNum) {
        this.serverNum = serverNum;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getUrlId() {
        return this.urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMirrorUrl() {
        return this.mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Integer getClassId() {
        return this.classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SelfSite (");

        sb.append(id);
        sb.append(", ").append(position);
        sb.append(", ").append(url);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(category);
        sb.append(", ").append(orderIndex);
        sb.append(", ").append(fetchTime);
        sb.append(", ").append(textValue);
        sb.append(", ").append(htmlValue);
        sb.append(", ").append(dateValue);
        sb.append(", ").append(numValue);
        sb.append(", ").append(serverNum);
        sb.append(", ").append(domain);
        sb.append(", ").append(urlId);
        sb.append(", ").append(location);
        sb.append(", ").append(description);
        sb.append(", ").append(mirrorUrl);
        sb.append(", ").append(classId);

        sb.append(")");
        return sb.toString();
    }
}
