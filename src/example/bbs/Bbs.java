package example.bbs;

public class Bbs {
	//유저의 정보를 저장하는 필드
	private int bbsID;
	private String bbsTitle;
	private String userID;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;

	public int getBbsID() {
		return bbsID;
	}

	public String getBbsTitle() {
		return bbsTitle;
	}

	public String getUserID() {
		return userID;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public int getBbsAvailable() {
		return bbsAvailable;
	}

	public void setBbsID(int bbsID) {
		this.bbsID = bbsID;
	}

	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}
}
