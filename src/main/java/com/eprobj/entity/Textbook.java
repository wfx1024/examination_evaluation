package com.eprobj.entity;

import java.io.Serializable;

/**
 * @Description  
 * @Author  KangJian
 * @Date 2019-12-31 
 */

public class Textbook  implements Serializable {

	private static final long serialVersionUID =  3051414190258212171L;

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 教材名称
	 */
	private String name;

	/**
	 * 出版单位
	 */
	private String publisher;

	/**
	 * 书号
	 */
	private String isbn;

	/**
	 * 版次日期
	 */
	private String editionDate;

	/**
	 * 版次
	 */
	private String edition;

	/**
	 * 再版书第1版版次日期
	 */
	private String editionBack;

	/**
	 * 再版书第1版书名
	 */
	private String nameBack;

	/**
	 * 再版书第1版书号
	 */
	private String isbnBack;

	/**
	 * 语种
	 */
	private String language;

	/**
	 * 教材类型1
	 */
	private String textbookType1;

	/**
	 * 教材类型2
	 */
	private String textbookType2;

	/**
	 * 教材类型3
	 */
	private String textbookType3;

	/**
	 * 教材类型4
	 */
	private String textbookType4;

	/**
	 * 教材类型5
	 */
	private String textbookType5;

	/**
	 * 教材出版形态
	 */
	private String publishForm;

	/**
	 * 是否高校
	 */
	private String isCollege;

	/**
	 * 主要作者1
	 */
	private String author1;

	/**
	 * 主要作者1著作方式
	 */
	private String authorMode1;

	/**
	 * 主要作者1单位
	 */
	private String authorUnit1;

	/**
	 * 主要作者1国籍
	 */
	private String authorNationality1;

	/**
	 * 主要作者2
	 */
	private String author2;

	/**
	 * 主要作者2著作方式
	 */
	private String authorMode2;

	/**
	 * 主要作者2单位
	 */
	private String authorUnit2;

	/**
	 * 主要作者2国籍
	 */
	private String authorNationality2;

	/**
	 * 主要作者3
	 */
	private String author3;

	/**
	 * 主要作者3著作方式
	 */
	private String authorMode3;

	/**
	 * 主要作者3单位
	 */
	private String authorUnit3;

	/**
	 * 主要作者3国籍
	 */
	private String authorNationality3;

	/**
	 * 主要作者4
	 */
	private String author4;

	/**
	 * 主要作者4著作方式
	 */
	private String authorMode4;

	/**
	 * 主要作者4单位
	 */
	private String authorUnit4;

	/**
	 * 主要作者4国籍
	 */
	private String authorNationality4;

	/**
	 * 主要作者5
	 */
	private String author5;

	/**
	 * 主要作者5著作方式
	 */
	private String authorMode5;

	/**
	 * 主要作者5单位
	 */
	private String authorUnit5;

	/**
	 * 主要作者5国籍
	 */
	private String authorNationality5;

	/**
	 * 主要作者6
	 */
	private String author6;

	/**
	 * 主要作者6著作方式
	 */
	private String authorMode6;

	/**
	 * 主要作者6单位
	 */
	private String authorUnit6;

	/**
	 * 主要作者6国籍
	 */
	private String authorNationality6;

	/**
	 * 教材国家级立项情况
	 */
	private String projectSituation;

	/**
	 * 其他立项情况
	 */
	private String otherSituation;

	/**
	 * 教材国家级获奖情况
	 */
	private String prizeSituation;

	/**
	 * 其他获奖情况
	 */
	private String otherPrizeSituation;

	/**
	 * 版权页图片
	 */
	private String copyrightImage;

	/**
	 * 封面图片
	 */
	private String coverImage;

	/**
	 * 提交状态
	 */
	private String status;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 修改人
	 */
	private String updateUser;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditionDate() {
		return this.editionDate;
	}

	public void setEditionDate(String editionDate) {
		this.editionDate = editionDate;
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getEditionBack() {
		return this.editionBack;
	}

	public void setEditionBack(String editionBack) {
		this.editionBack = editionBack;
	}

	public String getNameBack() {
		return this.nameBack;
	}

	public void setNameBack(String nameBack) {
		this.nameBack = nameBack;
	}

	public String getIsbnBack() {
		return this.isbnBack;
	}

	public void setIsbnBack(String isbnBack) {
		this.isbnBack = isbnBack;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTextbookType1() {
		return this.textbookType1;
	}

	public void setTextbookType1(String textbookType1) {
		this.textbookType1 = textbookType1;
	}

	public String getTextbookType2() {
		return this.textbookType2;
	}

	public void setTextbookType2(String textbookType2) {
		this.textbookType2 = textbookType2;
	}

	public String getTextbookType3() {
		return this.textbookType3;
	}

	public void setTextbookType3(String textbookType3) {
		this.textbookType3 = textbookType3;
	}

	public String getTextbookType4() {
		return this.textbookType4;
	}

	public void setTextbookType4(String textbookType4) {
		this.textbookType4 = textbookType4;
	}

	public String getTextbookType5() {
		return this.textbookType5;
	}

	public void setTextbookType5(String textbookType5) {
		this.textbookType5 = textbookType5;
	}

	public String getPublishForm() {
		return this.publishForm;
	}

	public void setPublishForm(String publishForm) {
		this.publishForm = publishForm;
	}

	public String getIsCollege() {
		return this.isCollege;
	}

	public void setIsCollege(String isCollege) {
		this.isCollege = isCollege;
	}

	public String getAuthor1() {
		return this.author1;
	}

	public void setAuthor1(String author1) {
		this.author1 = author1;
	}

	public String getAuthorMode1() {
		return this.authorMode1;
	}

	public void setAuthorMode1(String authorMode1) {
		this.authorMode1 = authorMode1;
	}

	public String getAuthorUnit1() {
		return this.authorUnit1;
	}

	public void setAuthorUnit1(String authorUnit1) {
		this.authorUnit1 = authorUnit1;
	}

	public String getAuthorNationality1() {
		return this.authorNationality1;
	}

	public void setAuthorNationality1(String authorNationality1) {
		this.authorNationality1 = authorNationality1;
	}

	public String getAuthor2() {
		return this.author2;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public String getAuthorMode2() {
		return this.authorMode2;
	}

	public void setAuthorMode2(String authorMode2) {
		this.authorMode2 = authorMode2;
	}

	public String getAuthorUnit2() {
		return this.authorUnit2;
	}

	public void setAuthorUnit2(String authorUnit2) {
		this.authorUnit2 = authorUnit2;
	}

	public String getAuthorNationality2() {
		return this.authorNationality2;
	}

	public void setAuthorNationality2(String authorNationality2) {
		this.authorNationality2 = authorNationality2;
	}

	public String getAuthor3() {
		return this.author3;
	}

	public void setAuthor3(String author3) {
		this.author3 = author3;
	}

	public String getAuthorMode3() {
		return this.authorMode3;
	}

	public void setAuthorMode3(String authorMode3) {
		this.authorMode3 = authorMode3;
	}

	public String getAuthorUnit3() {
		return this.authorUnit3;
	}

	public void setAuthorUnit3(String authorUnit3) {
		this.authorUnit3 = authorUnit3;
	}

	public String getAuthorNationality3() {
		return this.authorNationality3;
	}

	public void setAuthorNationality3(String authorNationality3) {
		this.authorNationality3 = authorNationality3;
	}

	public String getAuthor4() {
		return this.author4;
	}

	public void setAuthor4(String author4) {
		this.author4 = author4;
	}

	public String getAuthorMode4() {
		return this.authorMode4;
	}

	public void setAuthorMode4(String authorMode4) {
		this.authorMode4 = authorMode4;
	}

	public String getAuthorUnit4() {
		return this.authorUnit4;
	}

	public void setAuthorUnit4(String authorUnit4) {
		this.authorUnit4 = authorUnit4;
	}

	public String getAuthorNationality4() {
		return this.authorNationality4;
	}

	public void setAuthorNationality4(String authorNationality4) {
		this.authorNationality4 = authorNationality4;
	}

	public String getAuthor5() {
		return this.author5;
	}

	public void setAuthor5(String author5) {
		this.author5 = author5;
	}

	public String getAuthorMode5() {
		return this.authorMode5;
	}

	public void setAuthorMode5(String authorMode5) {
		this.authorMode5 = authorMode5;
	}

	public String getAuthorUnit5() {
		return this.authorUnit5;
	}

	public void setAuthorUnit5(String authorUnit5) {
		this.authorUnit5 = authorUnit5;
	}

	public String getAuthorNationality5() {
		return this.authorNationality5;
	}

	public void setAuthorNationality5(String authorNationality5) {
		this.authorNationality5 = authorNationality5;
	}

	public String getAuthor6() {
		return this.author6;
	}

	public void setAuthor6(String author6) {
		this.author6 = author6;
	}

	public String getAuthorMode6() {
		return this.authorMode6;
	}

	public void setAuthorMode6(String authorMode6) {
		this.authorMode6 = authorMode6;
	}

	public String getAuthorUnit6() {
		return this.authorUnit6;
	}

	public void setAuthorUnit6(String authorUnit6) {
		this.authorUnit6 = authorUnit6;
	}

	public String getAuthorNationality6() {
		return this.authorNationality6;
	}

	public void setAuthorNationality6(String authorNationality6) {
		this.authorNationality6 = authorNationality6;
	}

	public String getProjectSituation() {
		return this.projectSituation;
	}

	public void setProjectSituation(String projectSituation) {
		this.projectSituation = projectSituation;
	}

	public String getOtherSituation() {
		return this.otherSituation;
	}

	public void setOtherSituation(String otherSituation) {
		this.otherSituation = otherSituation;
	}

	public String getPrizeSituation() {
		return this.prizeSituation;
	}

	public void setPrizeSituation(String prizeSituation) {
		this.prizeSituation = prizeSituation;
	}

	public String getOtherPrizeSituation() {
		return this.otherPrizeSituation;
	}

	public void setOtherPrizeSituation(String otherPrizeSituation) {
		this.otherPrizeSituation = otherPrizeSituation;
	}

	public String getCopyrightImage() {
		return this.copyrightImage;
	}

	public void setCopyrightImage(String copyrightImage) {
		this.copyrightImage = copyrightImage;
	}

	public String getCoverImage() {
		return this.coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
