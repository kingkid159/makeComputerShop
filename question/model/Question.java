package question.model;


import java.util.Date;


public class Question {
	private Integer qNo;
	private String id;
	private String title;
	private Date regDate;
	private Integer pno;
	private int readCount;
	private String content;
	private String delete;
	private int ano;
	
	public Question(Integer qno, String id,Integer pno, String title, String content,String delete,Date regdate) {
		this.regDate=regdate;
		this.qNo=qno;
		this.id=id;
		this.title=title;
		this.pno=pno;
		this.delete = delete;
		this.content = content;
		
		
	}
	public Question(Integer ano,String id,String content,Date regdate,String delete) {
		this.ano=ano;
		this.id=id;
		this.content=content;
		this.delete=delete;
		this.regDate=regdate;
	}
	public Question(String id) {
		this.id=id;
	}

	public Integer getqNo() {
		
		return qNo;
	}
	public String getContent() {
		return content;
	}

	public Integer getPno() {
		System.out.println("pNo="+pno);
		return pno;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Date getRegDate() {
		return regDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public String getDelete() {
		return delete;
	}
	public int getAno(){
		return ano;
	}
	@Override
	public String toString() {
		return "Question [qNo=" + qNo + ", id=" + id + ", title=" + title + ", regDate=" + regDate + ", pno=" + pno
				+ ", readCount=" + readCount + ", content=" + content + ", delete=" + delete + "]";
	}
	
}

