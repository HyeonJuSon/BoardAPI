package com.son.board.model.dto;

public class UserDto {
	// db와 연동 시켜야 하기 때문에 같은 타입으로 매칭 해야한다.
	private String userid;//user의 id
	private String userpw;//user의 pw
	private String useremailfront;//user의 email 아이디
	private String useremailback;//user email 주소
	private String joindate;//user 회원 가입 date
	
	// constructor
	public UserDto() {}
	public UserDto(String userid, String userpw, String useremailfront, String useremailback, String joindate) {
		setUserid(userid);
		setUserpw(userpw);
		setUseremailfront(useremailfront);
		setUseremailback(useremailback);
		setJoindate(joindate) ;
	}
	
	// setter & getter
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public String getUseremailfront() {
		return useremailfront;
	}
	public void setUseremailfront(String useremailfront) {
		this.useremailfront = useremailfront;
	}
	
	public String getUseremailback() {
		return useremailback;
	}
	public void setUseremailback(String useremailback) {
		this.useremailback = useremailback;
	}
	
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDto [ userid=").append(userid)
				.append(", userpw=").append(userpw)
				.append(", useremail=").append(useremailfront+"@"+useremailback)
				.append(", joindate=").append(joindate).append("]");
		return builder.toString();
	}
	
}
