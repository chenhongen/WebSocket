package cn.ssm.test.vo;

import org.springframework.web.multipart.MultipartFile;

public class UserVO {
	private String usercd;

    private String username;

    private String pwd;

    private String email;

    private String phone;

    private Short sex;

    private Long birthday;

    private String address;

    private Short status;

    private Short isvip;

    private Short type;

    private String userico;

    private Integer credit;

    private String qqnumber;
    
    private String remark; // 个人简介
    
    private String prep1; // 联系方式公开度
    
    private MultipartFile upFile; // 头像

	public String getUsercd() {
		return usercd;
	}

	public void setUsercd(String usercd) {
		this.usercd = usercd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getIsvip() {
		return isvip;
	}

	public void setIsvip(Short isvip) {
		this.isvip = isvip;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getUserico() {
		return userico;
	}

	public void setUserico(String userico) {
		this.userico = userico;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getQqnumber() {
		return qqnumber;
	}

	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}

	public String getRemark() {
		return remark;
	}

	public MultipartFile getUpFile() {
		return upFile;
	}

	public void setUpFile(MultipartFile upFile) {
		this.upFile = upFile;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPrep1() {
		return prep1;
	}

	public void setPrep1(String prep1) {
		this.prep1 = prep1;
	}
	
}
