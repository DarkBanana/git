package cn.cjpt.mes.pojo.po;

public class Semiproducta {
	private String id;

	private String putstorenum;

	private String outstorenum;

	private String remainnum;

	private String rtime;

	private String remark1;

	private String remark2;

	private String mid;

	private String materielname;
	private String cname;
	private String unitname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPutstorenum() {
		return putstorenum;
	}

	public void setPutstorenum(String putstorenum) {
		this.putstorenum = putstorenum == null ? null : putstorenum.trim();
	}

	public String getOutstorenum() {
		return outstorenum;
	}

	public void setOutstorenum(String outstorenum) {
		this.outstorenum = outstorenum == null ? null : outstorenum.trim();
	}

	public String getRemainnum() {
		return remainnum;
	}

	public void setRemainnum(String remainnum) {
		this.remainnum = remainnum == null ? null : remainnum.trim();
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime == null ? null : rtime.trim();
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1 == null ? null : remark1.trim();
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2 == null ? null : remark2.trim();
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid == null ? null : mid.trim();
	}

	public String getMaterielname() {
		return materielname;
	}

	public void setMaterielname(String materielname) {
		this.materielname = materielname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

}